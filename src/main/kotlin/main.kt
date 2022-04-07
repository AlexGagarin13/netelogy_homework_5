fun main() {
    val service = WallService()
    val comment = Comments(1, true, true, true, true)
    val likes = Likes(55, true, true, true)
    val postComment = Comment(26, 25, 2, 25, "Text", null, 36, 14, null, null)

    val result = service.add(
        Post(
            5,
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
            null,
            null,
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

    val result2 = service.add(
        Post(
            5,
            2,
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
            null,
            null,
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
    println(result)
    println(result2)
    val createdComment = service.createComment(postComment)
    print(createdComment)
}