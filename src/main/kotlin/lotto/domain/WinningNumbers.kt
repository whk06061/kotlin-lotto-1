package lotto.domain

class WinningNumbers(winningLotto: Lotto, bonusNumber: Int) {
    init {
        require(!winningLotto.numbers.contains(bonusNumber)) { BONUS_NUMBER_DUPLICATE_ERROR }
    }

    companion object {
        private const val BONUS_NUMBER_DUPLICATE_ERROR = "당첨번호와 보너스 번호는 중복되면 안됩니다."
    }
}