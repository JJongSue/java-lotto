# 로또

## [Step1] 문자열 덧셈 계산기
* [X] 빈 문자열 또는 null 값을 입력할 경우 0을 반환
* [X] 숫자 하나를 문자열로 입력할 경우 해당 숫자 반환
* [X] 숫자 두개를 컴마(,)로 구분하여 합 반환
* [X] 추가적으로 콜론(:)을 구분자로 사용
* [X] //와 \n 문자 사이에 커스텀 구분자 지정
* [X] 음수를 전달할 경우 RuntimeException 사용

### Step1 feedback
* 과한 랩핑 금지
* List\<T\> x = new Vector<>(); 에서 Vector 사용한 이유
  * TODO: 실제 구현 시에 특별한 이유가 없었는데 이후에 한 번 생각해보기(ArrayList, VectorList 등)

## [Step2] 로또(자동)
* [X] 구입 금액을 입력 받는 기능
* [X] 입력된 구입 금액에 대해 구입할 로또 갯수를 출력하는 기능
* [X] 구입 해야할 로또 갯수에 대해 자동으로 6개의 로또 번호를 지정하여 발급하는 기능
* [X] 당첨 번호를 입력 받는 기능
* [X] 입력 받은 당첨 번호를 가지고 당첨 통계를 나타내는 기능

### 요구 사항에서 파생된 구현 리스트
* [X] 로또에서 사용되는 숫자를 나타내는 기능(객체지향 체조 요구사항)
* [X] 로또 티켓(6개 로또 번호 묶음)
* [X] 구입한 로또 목록
* [X] 로또 발급 기능
* [X] 로또 등수 구하는 기능
* [X] InputView
* [X] ResultView

### Step2 1차 피드백
* [ ] NumberPool 리팩토링
   * AS-IS: LottoNumber 및 LottoNumber 배열 만드는 모든 곳에 관여 중
   * TO-BE: 중복되지 않은 LottoNumber 배열 생성, 로또 번호 생성, 티켓 생성, 당첨 번호 생성으로 분리
* [X] 예외처리 메시징
* [ ] LottoResult 에서 ResultView 에 결과 전달하는 방식 변경(AS-IS: toString()) [참고 자료](https://javacan.tistory.com/entry/methods-about-exporting-domain-object-to-view)
* [ ] 객체지향체조 'getter/setter 금지' 부분 공부 [참고 자료](https://velog.io/@ybg7955/Clean-Code-10%EC%9E%A5-%ED%81%B4%EB%9E%98%EC%8A%A4)
* [ ] Enum 도입하여 LottoResult, Rank 로 분리 [참고 자료](https://woowabros.github.io/tools/2017/07/10/java-enum-uses.html)

## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)