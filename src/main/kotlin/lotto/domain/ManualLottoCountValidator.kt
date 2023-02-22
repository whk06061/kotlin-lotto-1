package lotto.domain

object ManualLottoCountValidator {

    private const val LOTTO_COUNT_NEGATIVE_ERROR = "구매할 수동 로또 금액이 투입 금액보다 큽니다."

    fun checkAvailable(manualLottoCount: Int, totalLottoCount: Int) {
        require(manualLottoCount <= totalLottoCount) { LOTTO_COUNT_NEGATIVE_ERROR }
    }
}
