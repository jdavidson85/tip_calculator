import java.text.DecimalFormat
import java.util.*

fun calTip() {
    val scanner = Scanner(System.`in`)
    val decimalFormat = DecimalFormat("#.00")

    var totalCost = 0.0
    var itemCost = 0.0

    while (true) {
        print("Enter the cost of an item (or 0 to exit): ")
        itemCost = scanner.nextDouble()

        if (itemCost == 0.0) {
            break
        }

        totalCost += itemCost
    }

    val taxes = totalCost * 0.025
    val totalWithTaxes = totalCost + taxes
    val tip = totalWithTaxes * 0.175

    println("Total cost: $${decimalFormat.format(totalCost)}")
    println("Taxes: $${decimalFormat.format(taxes)}")
    println("Total with taxes: $${decimalFormat.format(totalWithTaxes)}")
    println("Recommended tip (17.5%): $${decimalFormat.format(tip)}")
}

fun main() {
    calTip()
}
/*
Make sure to exit the program once you've entered in your total, and
it will give you the total, taxes, total with taxes, and tip.
*/