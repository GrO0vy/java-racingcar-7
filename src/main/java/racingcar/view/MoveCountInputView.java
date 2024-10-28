package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class MoveCountInputView implements InputView{
    private static final String MOVE_COUNT_INPUT_MESSAGE = "시도할 횟수는 몇 회인가요?";

    private Integer moveCount;

    @Override
    public void input(){
        System.out.println(MOVE_COUNT_INPUT_MESSAGE);
        Integer moveCount = Integer.parseInt(Console.readLine());

        this.moveCount = moveCount;
    }

    @Override
    public boolean isValidate() {
        return false;
    }
}
