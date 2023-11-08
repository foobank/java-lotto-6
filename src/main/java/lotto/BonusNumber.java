package lotto;

import java.util.List;
import java.util.ArrayList;

public class BonusNumber extends LottoNumber{

    private Integer bonusNumber;
    public BonusNumber(String bonusNumber) {
        super(bonusNumber);
        this.bonusNumber = Integer.parseInt(bonusNumber);
    }

    public void checkDuplicationFromWinNumbers(Integer bonusNumber, List<Integer> winNumbers) {
        if(winNumbers.contains(bonusNumber)) {
            throw new IllegalStateException("[ERROR] 당첨번호와 보너스 번호가 중복됩니다.");
        }
    }
    public Integer getBonusNumber() {
        return this.bonusNumber;
    }
}