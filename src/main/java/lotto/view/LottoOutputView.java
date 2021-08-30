package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoRank;
import lotto.domain.LottoResult;
import lotto.domain.LottoResults;

import java.util.List;

public class LottoOutputView {
    private static final String REQUEST_BUY_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String ALERT_BUY_MESSAGE = "개를 구매했습니다.";
    private static final String REQUEST_WINNING_NUMBER = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String LOTTO_RESULT_START_MESSAGE = "당첨 통계" + System.lineSeparator() + "---------" + System.lineSeparator();
    private static final String LOTTO_RESULT_MID_MESSAGE_1 = "개 일치 (";
    private static final String LOTTO_RESULT_MID_MESSAGE_2 = "원)- ";
    private static final String LOTTO_RESULT_MID_MESSAGE_3 = "개";
    private static final String LOTTO_RESULT_END_MESSAGE_1 = "총 수익률은 ";
    private static final String LOTTO_RESULT_END_MESSAGE_2 = "입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)";

    public void alertPurchaseMessage() {
        System.out.println(REQUEST_BUY_MESSAGE);
    }

    public void alertPurchaseListMessage(List<Lotto> lottoList) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(lottoList.size())
                .append(ALERT_BUY_MESSAGE)
                .append(System.lineSeparator());

        lottoList.stream()
                .forEach(lotto -> stringBuilder.append(lotto.getValue()).append(System.lineSeparator()));


        System.out.println(stringBuilder);
    }


    public void alertWinningNumber() {
        System.out.println(REQUEST_WINNING_NUMBER);
    }

    public void printResults(LottoResults lottoResults) {
        StringBuilder stringBuilder = new StringBuilder();


        LottoResult lottoResult = lottoResults.getLottoResult();
        double lottoYield = lottoResults.getLottoYield();

        stringBuilder.append(LOTTO_RESULT_START_MESSAGE);

        for (LottoRank result : LottoRank.values()) {
            stringBuilder.append(resultToString(result, lottoResult))
                    .append(System.lineSeparator());
        }

        stringBuilder.append(LOTTO_RESULT_END_MESSAGE_1)
                .append(lottoYield)
                .append(LOTTO_RESULT_END_MESSAGE_2)
                .append(System.lineSeparator());

        System.out.println(stringBuilder);
    }

    private String resultToString(LottoRank lottoRank, LottoResult lottoResult) {
        int sameNumberCount = lottoRank.getSameNumberCount();
        int winnings = lottoRank.getWinnings();
        int resultCount = lottoResult.getValue(sameNumberCount);
        return sameNumberCount + LOTTO_RESULT_MID_MESSAGE_1 + winnings + LOTTO_RESULT_MID_MESSAGE_2 + resultCount + LOTTO_RESULT_MID_MESSAGE_3;
    }
}
