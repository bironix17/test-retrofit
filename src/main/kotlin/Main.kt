import com.example.example.CategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main(args: Array<String>) {
    val apiInterface = ApiInterface.create().getDishes()

    apiInterface.enqueue(object : Callback<CategoriesResponse> {
        override fun onResponse(call: Call<CategoriesResponse>?, response: Response<CategoriesResponse>?) {



            println(response?.body()?.categories)
            println(response?.errorBody())
            println(response?.code())
        }

        override fun onFailure(call: Call<CategoriesResponse>?, t: Throwable?) {
            println(t)
        }
    })
}