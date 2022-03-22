object WallService {
    private var posts = emptyArray<Post>()
    private var PostId: Int = 0

    private fun generateId(): Int {
        PostId += 1
        return PostId
    }

    fun add(post: Post): Post {
        val post = post.copy(id = generateId())
        posts += post
        return posts.last()
    }

//    fun update(post: Post): Boolean {
//        for ((index, post) in posts.withIndex()) {
//            if (post.id = id)
//        }
//        return false
    }
}