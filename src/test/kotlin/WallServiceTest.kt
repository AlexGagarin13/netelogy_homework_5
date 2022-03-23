import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost_id_changed() {
        val service = WallService()
        val comment = Comments(1, true, true, true, true)
        val copyright = Copyright(2, "###", "###", "###")
        val likes = Likes(55, true, true, true)
        val reposts = Reposts(2, true)
        val views = Views(15)
        val donut = Donut(false, 0, placeholder = Placeholder(), false, "###")

        val result = service.add(
            Post(
                0,
                1,
                2,
                3,
                25,
                "Original",
                25,
                true,
                comment,
                copyright,
                likes,
                reposts,
                views,
                "Inform",
                88,
                true,
                true,
                true,
                false,
                false,
                false,
                donut,
                66
            )
        )

        assertNotEquals(0, result.id)
    }

    @Test
    fun update_True() {
        val service = WallService()
        val comment = Comments(1, true, true, true, true)
        val copyright = Copyright(2, "###", "###", "###")
        val likes = Likes(55, true, true, true)
        val reposts = Reposts(2, true)
        val views = Views(15)
        val donut = Donut(false, 0, placeholder = Placeholder(), false, "###")

        service.add(
            Post(
                1,
                1,
                2,
                3,
                25,
                "Original",
                25,
                true,
                comment,
                copyright,
                likes,
                reposts,
                views,
                "Inform",
                88,
                true,
                true,
                true,
                false,
                false,
                false,
                donut,
                66
            )
        )

        val update = Post(
            1,
            1,
            2,
            3,
            25,
            "Changed",
            25,
            true,
            comment,
            copyright,
            likes,
            reposts,
            views,
            "Inform",
            88,
            true,
            true,
            true,
            false,
            false,
            false,
            donut,
            66
        )

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun update_False() {
        val service = WallService()
        val comment = Comments(1, true, true, true, true)
        val copyright = Copyright(2, "###", "###", "###")
        val likes = Likes(55, true, true, true)
        val reposts = Reposts(2, true)
        val views = Views(15)
        val donut = Donut(false, 0, placeholder = Placeholder(), false, "###")

        service.add(
            Post(
                1,
                1,
                2,
                3,
                25,
                "Original",
                25,
                true,
                comment,
                copyright,
                likes,
                reposts,
                views,
                "Inform",
                88,
                true,
                true,
                true,
                false,
                false,
                false,
                donut,
                66
            )
        )

        val update = Post(
            5,
            1,
            2,
            3,
            25,
            "Changed",
            25,
            true,
            comment,
            copyright,
            likes,
            reposts,
            views,
            "Inform",
            88,
            true,
            true,
            true,
            false,
            false,
            false,
            donut,
            66
        )


        val result = service.update(update)

        assertFalse(result)
    }
}