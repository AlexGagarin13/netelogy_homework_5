class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var PostId: Int = 0

    class PostNotFoundException(message: String) : Exception(message) {
    }

    fun createComment(comment: Comment): Comment {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
            } else {
                throw PostNotFoundException("Такого поста не существует!")
            }
        }
        return comments.last()
    }


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
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                println(posts[index])
                return true
            }
        }
        return false
    }
}



