data class Comment(
    val id: Int,
    val fromId: Int,
    val postId: Int,
    val date: Int,
    val text: String,
    val donut: Donat?,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachment: Attachment?,
    val thread: Thread?,
) {
    class Donat(
        val isDon: Boolean,
        val placeholder: String?
    ) {
    }

    class Thread(
        val count: Int,
        val canPost: Boolean,
        val showReplyButton: Boolean,
        val groupsCanPost: Boolean
    ) {

    }
}
