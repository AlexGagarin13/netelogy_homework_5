class WallService {
    private var posts = emptyArray<Post>()
    private var PostId: Int = 0

    private fun generateId(): Int {
        PostId += 1
        return PostId
    }

    fun add(post: Post): Post {
        val newPost = post.copy(id = generateId())
        posts += newPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, posted) in posts.withIndex()) {
            if (post.id == posted.id) {
                posts[index] = post.copy(
                    ownerId = posted.ownerId,
                    date = posted.date
                )
                println(posts[index])
                return true
            }
        }
        return false
    }
}

