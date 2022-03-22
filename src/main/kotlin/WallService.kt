object WallService {
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
        for ((index, post ) in posts.withIndex()) {
            if (post.id == posts[index].id) {
                posts[index] = post.copy(
                    id = post.id,
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
            }
            return true
        }
        return false
    }

}
