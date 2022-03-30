data class Comment(
    val id: Int,
    val from_id: Int,
    val postId: Int,
    val date: Int,
    val text: String,
    val donut: Donat?,
    val reply_to_user: Int,
    val reply_to_comment: Int,
    val attachment: Attachment?,
    val thread: Thread?,
) {
    class Donat(
        val is_don: Boolean,
        val placeholder: String?
    ) {
    }

    class Thread(
        val count: Int,
        val can_post: Boolean,
        val show_reply_button: Boolean,
        val groups_can_post: Boolean
    ) {

    }
}
