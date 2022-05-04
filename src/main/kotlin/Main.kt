import com.example.ypackfood.models.dima.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main(args: Array<String>) {

    val order = Order(
        address = Address("Краснодар"),
        client = Client(43),
        dishes = listOf(
            Dishe(
                id = 3,
                basePortion = BasePortion(1, PriceNow(9))
            )
        ),
        750
        )

    val apiInterface = ApiInterface.create().createOrder(order)

    apiInterface.enqueue(object : Callback<Order> {
        override fun onResponse(call: Call<Order>?, response: Response<Order>?) {


            println(response?.body()?.dishes)
            println(response?.errorBody())
            println(response?.code())
        }

        override fun onFailure(call: Call<Order>?, t: Throwable?) {
            println(t)
        }
    })
}