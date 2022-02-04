package es.joseluisgs.models

import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
/**
 * Order model, los id y data, esta vez los voy a poner nulos para que no estén obligados a pasarlos
 */
data class Order(
    var id: String = "",
    val customerID: String,
    val createdAt: String = LocalDateTime.now().toString(),
    val contents: List<OrderItem>
) {
    constructor(customerID: String, contents: List<OrderItem>) : this(
        customerID,
        LocalDateTime.now().toString(),
        contents
    )

    constructor(id: String, customerID: String, contents: List<OrderItem>) : this(
        id,
        customerID,
        LocalDateTime.now().toString(),
        contents
    )
}
