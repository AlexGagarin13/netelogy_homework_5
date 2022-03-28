import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost_id_changed() {
        val service = WallService()
        val comment = Comments(1, true, true, true, true)
        val likes = Likes(55, true, true, true)

        val result = service.add(
            Post(
                0,
                1,
                2,
                3,
                25,
                "Original",
                25,
                36,
                true,
                comment,
                null,
                likes,
                null,
                null,
                "Inform",
                null,
                null,
                88,
                null,
                true,
                true,
                true,
                false,
                false,
                false,
                null,
                66
            )
        )

        assertNotEquals(0, result.id)
    }

    @Test
    fun update_True() {
        val service = WallService()
        val comment = Comments(1, true, true, true, true)
        val likes = Likes(55, true, true, true)

        service.add(
            Post(
                0,
                1,
                2,
                3,
                25,
                "Original",
                25,
                36,
                true,
                comment,
                null,
                likes,
                null,
                null,
                "Inform",
                null,
                null,
                88,
                null,
                true,
                true,
                true,
                false,
                false,
                false,
                null,
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
                36,
                true,
                comment,
                null,
                likes,
                null,
                null,
                "Inform",
                null,
                null,
                88,
                null,
                true,
                true,
                true,
                false,
                false,
                false,
                null,
                66
            )

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun update_False() {
        val service = WallService()
        val comment = Comments(1, true, true, true, true)
        val likes = Likes(55, true, true, true)

        service.add(
            Post(
                0,
                1,
                2,
                3,
                25,
                "Original",
                25,
                36,
                true,
                comment,
                null,
                likes,
                null,
                null,
                "Inform",
                null,
                null,
                88,
                null,
                true,
                true,
                true,
                false,
                false,
                false,
                null,
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
            36,
            true,
            comment,
            null,
            likes,
            null,
            null,
            "Inform",
            null,
            null,
            88,
            null,
            true,
            true,
            true,
            false,
            false,
            false,
            null,
            66
        )

        val result = service.update(update)

        assertFalse(result)
    }
}