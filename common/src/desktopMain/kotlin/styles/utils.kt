package styles

actual fun format(value: Number?, transform: (String)-> String ): String {
    return "desktop $value" + transform(value.toString())
}