package `20240409`


class Account(var ano: String, var owner: String, var balance: Int) {
    override fun toString(): String {
        return "Account{" +
                "ano='" + ano + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}'
    }
}
