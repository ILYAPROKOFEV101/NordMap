import kotlinx.serialization.Serializable


@Serializable
data class UserKeyResponse(val userKey: String)


data class Post_User_info_data(
    val name: String,
    val img: String
)
