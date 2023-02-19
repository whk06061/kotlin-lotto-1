package lotto.domain

class LottoNumber(val number: Int) {
    init {
        require(number in (MINIMUM_LOTTO_NUMBER..MAXIMUM_LOTTO_NUMBER)) { LOTTO_NUMBER_RANGE_ERROR }
    }

    companion object {
        const val MINIMUM_LOTTO_NUMBER = 1
        const val MAXIMUM_LOTTO_NUMBER = 45
        private const val LOTTO_NUMBER_RANGE_ERROR = "로또 번호는 1과 45 사이여야 합니다."
    }
}
