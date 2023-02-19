package lotto.exception

object Validator {
    private const val MONEY_NOT_NUMBER_ERROR = "금액은 숫자여야 합니다."
    private const val BONUS_NOT_NUMBER_ERROR = "보너스 볼은 숫자여야 합니다."

    fun checkInputMoney(input: String) {
        val number = input.toIntOrNull()
        require(number != null) { MONEY_NOT_NUMBER_ERROR }
    }

    fun checkInputBonusNumber(input: String) {
        require(input.toIntOrNull() != null) { BONUS_NOT_NUMBER_ERROR }
    }
}
