import com.example.example.CategoriesResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ApiInterface {

    @GET("dishes")
    fun getDishes() : Call<CategoriesResponse>

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