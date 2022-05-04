
import com.example.ypackfood.models.dima.Order
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiInterface {

//    @GET("dishes")
//    fun getDishes() : Call<CategoriesResponse>

    @POST("createOrder")
    fun createOrder(@Body order: Order) : Call<Order>

    companion object {

        fun create() : ApiInterface {
            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            val httpClient = OkHttpClient.Builder();
            httpClient.addInterceptor(logging);

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .client(httpClient.build())
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}