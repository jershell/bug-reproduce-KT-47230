package styles

actual fun format(value: Number?, transform: (String)-> String ): String {
    return "android $value" + transform(value.toString())
}