### Object Oriented

- data를 object에 바인딩, operation으로만 data manupulation하도록
- Object 간 communication을 통해 system 기능 구현
- 문제해결을 위해 object 간 communication, collaboration by message passing
- 시스템이 제공하는 섭스를 object 간 collaboration, message passing, communication을 통해 효과적으로 구현하는 것
- 

### Best Principles of oo

1. Abstraction : 가장 중요하고 필수적인(essential), 객체를 특징짓는 속성, 서비스와 관련된 중요한 속성만을 남기고 real world 객체를 sw entity로 만드는 것 (abstraction을 통해 class로 모델링)
2. Encaptulation : 내부 구조 모르고 사용 가능하도록 sw 디자인할 것, information hiding- inface와 같은 abstract객체를 통해 객체의 세부 속성 모른채로 communication
3. Inheritance (generalization) : kind of, is a 관계, 공통속성을 abstract level로 관리
4. Polymorphism : 
   1. 하나의 interface 에 여러 다른 구현 숨기는 것 (context에 따른 다른 구현) - interface는 외부 actor가 접근할 수 있는 경로
5. Composition : 
   1. has-a relationship (하나의 obj가 다른 obj 가짐, compose 함)
   2. defined dynamically at run time by acquiring reference to other obj (runtime에  compatible object로 변경도 가능)
   3. does not break encaptulation because objects are accessed by interface
   4. **OO에서 polymorphism을 실현하는 가장 효과적인 방법**

### OOAD vs SASD

- Procedure programming
  - 방법론 : SASD
  - 프로그램 기본요소 : procedure
  - 자료구조와 알고리즘, 실행 순서가 중요
  - 데이터와 알고리즘이 독립적
  - cyclic하게 흘러가는 data
  - sasd
    - top-down, divide and conquer 방식
    - DFD를 이용한 functional vuew
    - main modeling D : SA : DFD / SD : Structural chart

### OOAD 

​	- iterative, waterfall 구분과는 무관 (어떤 개발방식이든 취할 수 있음 ooad는 개발방법론이라기 보다는 설계방식?)

- OOA
  - 사용되는 d  : domain model(class d notation 사용), usecase D 
    - use case d : external user가 시스템 어떻ㄱ ㅔ사용하는지 시나리오별로 서술, system boundary에 따라 external user 달라짐 예를 들어
    - use case d 기반으로하여 domain model 만듦
    - domain model : 도메인에 대한 이해 돕기 위해 
  - Object identification : SW가 사용되는 도메인 컨텍스트,(Application domain) 고려하여 중요하고 필수적인 속성만 남긴 object 를 찾는 것 (object화할 concept 추출?)
  - Requirement 파악

- OOD
  - class d, sequence d 사용
  - use 케이스 하나씩 꺼내서 sequence D 작성-> CLASS D 작성
  - Obj 정의, obj 간 관계, visibility 정의
  - 시스템 기능 구현을 위해 obj간 어떻게 통신하는지 정의

### SW Process Model

- app domain에 따라 적절한 model

- water fall 

  - incremental(점진적인)
  - requirement 고정된 극소규모 or 대규모플젝틍서 사용

- iterative

  - agile이 대표적 iterative (agile포함한 방법론 총칭)
  - iteration 단위에서 구현가능한 만큼만 identification 하고 rmfla
  - 빠른 프로토타이핑 및 개발
  - Agile
    - ex - xp, tdd
    - iterative(several cycles)
    - incremental(한번에 완성이 아니라 점신적으로)
    - evolutionary : requirement 수정 예견될 때 추가해가면서
    - 요구사항 정의 때 유저 인볼브 시킴
    - manifesto
      - Individual over process and tool
      - Working sw over documentation
      - customer collabo over contract negotiation
      - customer collaboration over contract negotiation
      - responding to change over following a plan (flexible)

- UP (Rational Unified Process)

  - oo sw 개발의 표준 : UP 기반의 Iterative한 OOAD개발방법론
  - Risk driven (risk 해결해가면서 iteration)
  - Archistic centric, client centric
  - Iterative 방식 (incremental, evolutionary)
  - 3주단위로 waterfall cycle을 iteration함
  - Risk driven, client driven, arctecture centric
  - **모든 단계에서 use cases 가 중요하게 생각됨**
    - 모든 uc정의 후, 이번 iteration 개발 대상 uc를 analysis 해서 fully dressedup된 uc 작성 (개발 안할 uc의 경우 brief)
    - uc는 ooa, ood, ooi 모든 단계에서 중요
  - 4 phase(inception -> elaboration -> construction -> transition)
    - Inception : 프로젝트 플랜
    - Elaboration  : architecture 확정, iteration 끝마다 requirement ws(steak holders모여서 discussion, evaluation). **elaboration에서 architecture, client requirement fix.**prototype 완성
    - Construction : archistic insensitive한 requirement 들 구현
  - OO SW 개발의 defacto 표준

  

  ### UML

  - sw에 한정되지 않은 범용으로 쓰이는 defacto 표준

  - 여러 모델링 다이어그램을 통합
    
    - data modeling(erd), business modeling(workflow), object modeling, component modeling
    
  - UML Semantic
    - 4-layer metamodel architecture : Instance -> model -> meta model -> meta meta model
    - MOF(Meta Object Facility) : 4 layer meta model 구조 정의
      - L M3  Meta meta model layer (mof layer) : modeling layer
      - L M2 : Meta model layer (uml meta model. 13개 다이어그램 정의) : modeling layer
      - L M1 : Model layer (uml model) : modeling layer
      - L M0 : Information layer (app) : runtime layer
      - uml로 uml과 그에 대한 메타 모델인 mof 정의
    
  - Structural
    
    - classD(static), objectD(snapshot), ComponentD, Composite StructureD, deploymentD, packageD
    
  - Behavior
    
    - activityD, usecaseD, stateMachineD, interactionDs(sequence, communication, interaction overview, timing)
    
  - **대표적인 것 3개 : class, sequence, use case** + domain model

  - #### Diagram 작성 순서

    1. use case 끄집어내서 
    2. seq D그리고
    3. class D 채움

  

  #### Use Case D (notation p#93)

  - Usecase의 이름, actor, 그들 간 관계 정의
  - Actor : behavior있는 단위. 사람 뿐 아니라 조직, 컴퓨터 등도 actor가 될 수 있음
    - Primary actor : 시스템에 접근하는 사용자
    - Secondary actor :  시스템 사용자 도와주는 액터. 주로 외부 시스템 = supporting actor
  - SRS에 functional req표현할 때 사용
  - use case만들면서 requirement 구체화해감

  ====

  - Use case

    - actor가 시스템 이용하는 시나리오(text. 성공/실패 경우 포함)

      - Main success scenario : 일반적, 전형적인 성공 케이스

      - Alternative scenario(extension) : 가끔 발생하는 성공or실패케이스

      - Exceptional scenario : 예외케이스. 정상결과로 돌아오지x

        

    - 3 format (UP phase에 따라 다양한 수준으로 개발, Construction phase까지 지속적으로 refinement. 확정은 construction 전에. 이후에는 변경은 안되고 refinement)

      - Brief 

        - senmantc, syntatic준수 필요x

        - 구현 전 요구사항 수집 시커뮤니케이션 도구로 사용

        - 주로 main sucess 시나리오만 작성. 1단락 정도분량

          

      - Casual  

        - **alter native와 main 시나리오 구분해서 작성**

      - Fully dressed

        - 구현(OOI) 직전 단계(OOD)에 작성
        - precondition, main sucess, extension, success guarantee 등 세부 내용 모두 포함
        - technology and data variation list 도 포함(io, data format 등)

    - 작성원칙 (Guideline)

      - Write in Essential style

        - UI free, Flexible한 스타일 (여지를 많이 주는 방식)
        - 구체적 액션보다 시스템 responsibility, user intention 중심으로

      - Write Black-box use case

        - sw내부 동작 방식에 대한 구체적 서술x
        - impl detail x
        - **Define what system does(analysis), not how it does(design)**

      - 개발범위 밖의 UI, HW에 independent하게 작성 

      - Blackbox방식으로 작성(sw내부 동작방식 구체적 서술x)

        

    - sw분야사용한정x. (범용 기능요구사항 표현 방법)

    - UP에서는 **functional** requirement 수집을 use case로 대신함(up에서 필수). FURPS+ requirement타입과관련???

    - USECASD D보다 USECASE 자체가 핵심

  - UseCaseD

    - actor위치 무관
    - 시스템 바운더리 표시 (바운더리에 따라 액터 달라질 수 있음)

  

  #### Class D

  - 시스템 구성하는 class(attribute, operation), 그들 간 관계 표현

  - static diagram

  - OOA단계(-> Domain model. conceptual 관점), OOD단계(->Design Class Diagram : 디자인레벨의 cd. 디자인 관점)에 모두 사용됨

  - multiplicity 구체적으로 정하지 않고 1:1인지 1:多 정도로 정의 (object D에서 구체적으로 표기)

  - domain model : relatinoship 그냥 association으로만 표기

  - dcd : 방향도 표시

  - usecase -> cd 옮길 때

    - noun : class / verb : operation / adj  attribute

  - 3 개 구획(compartment) - 줄일 수 있음 (detailedness level)

  - Object : individuals of a system

    - anonymous obj : 너무 많이 생성(발생)되어서 이름 특정 불가 or 이름 모를 때. :클래스명

  - Attribute syntax (표기법 : p#144~)

    - visibility
      - +(pub), -(prv), #(protected), ~(package), /(derived att like age. derived from other att or association)
    - ...

  - Type of relationship (p#139~)

    - Dependency (association 아님에 주의)

      - weakest (local v, parameter)
      - temporal 연관관계
      - class d보다는 component d에 주로 사용(구현 직전단계정도에 나옴)

    - Association

      - domain model에서부터 나옴. 장기간동안 연관관계 가짐

      - Binary association

        - navigability

      - n-ary association : 마름모

      - Association class : association 관계를 별도의 class로 관리 및 표기(p#147), 점선으로 association line에 이어놓음

      - singletone class  : class name 구획에 '1'  표기

      - Active class (p#149)

        - active object의 클래스
        - active obj : main thread에서 독립된 thread에서 실행 및 관리되는 obj
        - double line으로 표기

      - Interface (p#150)

        - notation  : 롤리팝+소켓 / dependency line / interface impl

      - Aggregation : Composition (강), shared aggregation (약)

        - association의 일종

        - a class is part of b class 관계

        - 특성 : transitive(a가 b의 부분, c가 b의 부분 => c는 a의 부분), asymmetric(a->, b->a 동시에 이뤄질 수 없는 관계)

          

      - Shared aggregation

        - part가 whole수명과 무관하게 존재(-> relation end. 화살표없는 쪽이  >1)
        - one element can be part of multiple 동시에 가능

      - Composition

        - existence dependency (part 수명이 whole에 따라 결정)
        - one element는 동시에 하나의 whole에망 소속 가능 (relation end 화살표 없는 쪽이 max1)

      - Generalization

        - Inheritance
        - 가장 강력한 관계
        - super class의 모든 public 속성이 sub class로 상속 (public attribute, aggregation, association)
        - sub class는 상속받은 것 이외에 개별적인 속성들 가지게 됨
        - Abstract class
          - sub class들의 common 속성 관리
          - super class 객체는 생성될 수 없음(cannot be instantiate)
          - notation : {abstract} or 이탤릭 표기
          - multiple inheritance (자바 syntax에선 금지이나 uml모델리에서는 가능)

      

  #### Object D

  - snapshot
  - 특정 시점의 class instance
  - object 간 direction 까지 표기, attribute value 표기, operation은 표기하지 않음(class별로 동일하므로)
    - attribute : structural character, state of a class (object 개별 값)
    - operation : behavior 클래스 obj공통

  #### Package D

  - Logical Architecture
  - Layered archi 정의
  - layered archi를 elaboration p에서 그리면 logical, 

  #### Comonent D (p#289)

  - Component : 실제 SW개발단위 -> 코드 구현 어느정도 되었을 때 작성 가능
  - Logical 단계 (hw에 올라가야 physical)
  - 크루첸 뷰 모델에서 development view에 속함
  - sw system 이나 상위 comp 구성하는 component와 그들 간 관계(how wired together)
  - 구조와 inter dependency 표현
  - 크루첸 4+1 view model
    - 시스템 아키텍처 layer 구성에 도움이 되는 아키텍처를 보는 관점
    - Logical view
      - packageD
      - classD
    - Process view
      - interactionDs
    - Phisical view
      - deployD
    - Development view
      - compenentD
    - +use case view
  - UML Component
    - 독립적 **개발** 단위 -> 개발업무 assign 기준
    - class가 모여서 package구성되면 그것이 component에 매핑됨
    - 여러개 클래스 모아둔 것. 
    - 전체 클래스다이어그램의 일부, obj diagram 이 컴포넌트 내부에 들어갈 수 있음
    - 중첩 가능
    - interface 를 제공하거나 받아서 사용함
    - 일반적으로 소스파일이나 개발중인 element 
    - ports를 가지고, internal structure(component 내부 component 가능) 보여줌
    - interface를 통해 다른 component 와 communication - dependency 로 연결
    - <<component>> 표시. <<subsystem>>도 컴포넌트
    - 시스템을 reusable, managable, swappable 부분으로 조직화한 단위
    - cf) deployD의 component
      - 프로세서 위에서 동작하는 run time element. component D의 component의 instance
  - Interface (p#286)
    - Provided interface : component가 realize 한 interface (output)
    - Required interface : component가 필요로 하는 function의 interface(input)
  - port : interface 여러개 묶어둔 것. 포트에 연결되는 in/output은 연관관계 있어야 함
  - Component를 class or obj D가 채울 수 있음 -> 이것이 composite structure D. (여기에 multiplicity까지 표현)

  #### Composite Structure D

  - component D를 hierchy표현한 것. 주로 두 개 함께 그림
  - runtime instance관계 표현?

  #### Depliyment D

  - runtime instance들이 hw node에 올라간 상태 표시
  - static view of the runtime configuration(os, db 종류 등) of hw node
  - 개발초기(inception, elaboration)에는 나타나지 않음. constructin, transition phase에 나옴

  #### Sequence D (notation p#190)

  ​	- life line 기준으로 순서 생각하기***

  - Interaction D의 일종

  - Time Sequence에 따른 object collaboration 표시

  - **특정 use case 시나리오에서** object 간 interaction을 표시

  - 객체들끼리 주고받는 메시지의 순서를 시간의 흐름에 따라 보여주는 D

  - Functional requirement 별로 하나씩 그림

  - msg 전달 많아지면 무한대로 커질 수 있음<>communicationD

  - object 가 role로 표기되는데, 시나리오에 따라 동일 object가 다른 role될 수 있음

  - seqD에서도 object 생성 표시 가능

  - notation : 세로bar로 operation body 표시, 위->아래 시간흐름

    - Lifeline box : Interaction에 참여하는 Role(participants). object, class, subsystem, component 등이 role이 됨 (p#188)

      - <<metaclass>> : metaclass라는 abstract class의 obj
      - singletone object 표시 가능 1표시

    - Life line : Role 에 연결된 라인

      - 하나의 life line 내에서는 위->아래가 시간순서
      - 다른 life line 사이에서는 위->아래 시간순서 아님
      - 다른 life line이라도 서로 msg 주고 받으면 시간순서 위아래 맞춰야 함

    - Message body : 세로바, execution specification. 메세지바 길이가 message body

    - Message (p#192)

      - sync msg : 까만화살표 (sequential 학 ㅔ실행)

      - async msg : thread만 이걸로 표시. 그냥 화살표

      - response msg  명확할 경우는 주로 생략. 점선 (ack)

      - Found msg : sender가 익명 혹은 시스템과 무관. 주로 system operation. 까만점에서 출발하는 화살표

      - Lost msg : receiver가 익명 혹은 무관. 까만점으로 도착하는 화살표

      - Time consuming msg : 길/짧 무관하게 전송시간 있으면 비스듬히 표시

      - object creation msg : 점선이 lifeline box 정중앙으로 꽂힘 (생성되는 box가 더 아래에 있도록) 

      - object destruction msg : <<destroy>> 를 msg 화살표 우에 씀. lifeline 에 들어가는데 거기에 x표시

      - Message sytax

        ```
        return = message (parameter:parameter type) : return type
        ```

        

  - **communication D와 동일한 expression power**
    - 비교 
      - SeqD : Time sequence에 포커스 두고 object collaboration표시
      - CommD : collaboration 자체에 포커스
  - Combined Fragment and Operators (기능) p#196
    - 여러 시나리오를 한 장에 압출할 때 사용
    - 12 pre-defined types of operators
    - Frame : 다이어그램에서 fragment의 영역. operator와 quard 가짐
    - seqD 에서 주로 사용 : alt(switch), opt(else 없는 if), loop(for, while), break
    - alt Fragment
      - alternative seq
    - loop[min:max] max횟수까지 하는거? 아님 max 이전?
    - seq : 흐름에 영향은 없으나 내부 흐름을 주의해서 보라는 의미 (dependency 없는 life line 은 순서 뒤바꿔도 됨)
    - strict : 순서 그대로만
    - par : ?p#205
    - critical : atomic area : unexpected event 에 의해 방해되지 않는다는 의미
    - interaction reference : 라이브러리처럼 sd 

  #### Communication D == Collaboration D

  - usecase의 dynamic behavior표시에 사용
  - sequence D와 유사. time sequence보다는 object  간 collaboration 관계에 포커스
  - 시퀀스D + 방향, 번호로 순서 표시 (번호 따라가며 파악. 한장에 표현 가능)
  - 번호 표기 없는 operation : system operation
  - Link and message로 구성
    - Link : connection path between two object indicating some form of possible navigation and visibility between the object
    - All message fow on the same line, and many messages may flow along a link
      - message는 message 표시자 + 작은화살표로 line 위에
    - Sequence number is added to show the sequential order of messages in the curent thread of control

  #### Interaction between interactin d and class d

   - Interaction 다이어그램 기준으로 class d가 iterative하게 생성
     	- 시퀀스 다이어그램 그리기 시작하면서 주요 class와 method 도출 -> 그리고 -> 반복해가면서 서로 완성되어 나감

  

  #### Timing D

  - 주어진 시간의 behavior표시
  - sequece d의 일종
  - life line  vertically 다른 주제 표현

  #### Interaction overview D

  - 인터랙션의 흐름의 제어의 오버뷰에 초점
  - 여러개 interaction D 등을 하나의 커다란 FLOW CHART로 그리는 것
  - activity D의 ~

  #### State Chart D (Notation : p#230)

  - entity의 상태와 상태변화 때 entity 의 behavior를 표시

    - finite한 statement
    - system이나 obj의 가능한 상태 표시
    - 이벤트 발생시의 state 변화 표시

  - ooa, ood 에서 모두 사용. ood에서 보다 디테일

  - 똑같은 이벤트 결과가 상태에 따라 다르게 동작할 때 사용하면 좋음

  - 모델링 대상의 hierachical structure 표현 가능

  - 이벤트를 브로드캐스팅함. parallel하게 이벤트 진행??

  - Finite state machine을 이용한 시스템 을 표현할 때 많이 사용

  - Finite state machine 특징

    - or state (comosite state)
    - and state : 
    - history variable node 

  - cf) activity D는 비지니스 프로세스 모델 묘사에 주로 사용

  - active state : object 가 그 상태 / 해당 state에 명시된activity 실행 가능

  - state operation

    - entry/Activity (...) : 진입시점 1회
    - exit/Activity (...) : 나갈 때 1회
    - do/Activity(...) : 해당 state 동안 반복

  - state

    - Initial state : 개념적
    - terminate state : 개념적. 이 상태로 가면 terminate state의 parent state 빠져나감!!!
    - final state : real state

    ```
    S ---e [g] / A -> T : S상태일 때 e 이벤트 발생하면 g 조건 확인 후 충족하면 ***A action*** 후 Tstate로 읻ㅇ
    ```

  - 

  - Transition

    - 상태 변경
    - ex ) S상태가 active되면 ~~

  - State 종류 (p#238)

    - Composite state (or state)
      - == complex state, nested state, or state
      - 여러 substate 포함. 한순간 하나의 substate만 active
      - state 내부에도 initial, terminate state 존재
      - 중첩 state경우 빠져나갈 때 현재 substate exit action 한 후 parent state exit 액션 하게 됨
      - 이벤트 한번은 지금 상탱서 한 번만 움직임!!
    - Orthogonal state
      - and state
      - composite state가 점선으로 2개 이상 구획으로 나눠진 상태
      - **concurent substates** : 한 시점에 각 구획별로 active state가 하나씩 존재!!!!!!!!!
      - exit : 모든 구획(region)의 state가 final로 가야 해당 parent state 나갈 수 있음(대기)
      - entiry : orthognal state로 이동하면 모든 리전의 initial state 가 active됨. 어느 리전으로 진입했든 상관 없이. -> deadlock condition 주의 (terminate 안거치고 바로 나가는 event 받은 region 있을 경우 안받은 region은 terminate에서 계속 기다림)
      - parallelization node : entry 안거치고 중간 상태로 진입하게 함
    - Submachine state (SMS)
      - 가져다쓰는 state node에 표시refinement symbor로 표시 )(state name : submachine state name), 안경표시
      - library 같은 것
    - History state
      - composite state에서 최종적으로 active되었던 substate 기억
      - composite state 밖에서 안으로 들어오면서 old sub state로 시작해서 순차적으로 다른 모든 entry state로 이동
      - Shallow histry : H마크 : composite state의 동일 레벨 state로 복귀 (튕겨져나간 state와 동일 레벨의 initial로 감. H그려진 state와 튕겨져나간 state가 동일)
      - Deep history : H*마크 : 튕겨져나간 state에서 다시 시작

  #### Activity D (notation p#263)

  - 타겟 시스템의 flow of control 묘사 (class의 활동 나타내는 것 아님)
  - High level에서의 큰 흐름. 비지니스 로직 이해에 도움
  - 시스템 수준, 하나의 오퍼레이션 수준에서도 작성 가능
  - optional 한 d
  - business rule, operation, use case, business process 표시
  - flow chart, dfd으 oo 버전? (dfd와는 다름) 
  - system의 dynamic한 측면 표시 (action 흐름)
    - from activity to activity 흐름 컨트롤 시스팀
    - alternative flow 보여줌
    - parallel, branched and concurrent flow of the system
  - message(데이터) 흐름은 보여주지 않음
  - operation 흐름을 method레벨에서 보여줌 ?? -> 아닐 수도 있음
  - 중첨 허용하지 않음 (flat 한 흐름 보여줌)
  - activity 간 transition 이 event로 trigger되는 거 아님. activity 끝나면 다음으로 넘어감
  - decision 부분이 상호배타적이어야 하는 것은 아님 ???
  - object와 그의 상태도 표시 가능 P#267
  - swim lanes : 세로줄로 구분. 칸마다 person 조직 부서 등 해당 activity 관련자 라벨링 (역할 표시 용?)
  - state char d와의 비교
    - 이벤트 리스 (s : event based transition)
    - state chart의 선이 activity diagram의 노드가 됨
    - state chart가 더 많은 정보
  - Activity : core symbol, 둥근테두리 사각형, 의미있는 이름
  - Transition : activity 간의 흐름 (trigerless), open arrow
  - start state, decision point, guard condition, final state
  - object flow : dashed arrow로 연결, 사각형 표시, []로 state 표시
  - parallel한 실행 표현 가능 (P#270)
  - 

  

  

- class
  - common한 operation, state 공유하는 object set
  - Rela world의 entity -Modeling(abstraction)-->class --instanciation--> sw object
  
- ooi

OOA : 도메인 컨셉 도출/정의

OOD : SW Object 정의, 요구사항 충족을 위한 object 간 collaboration 정의

UML

- SYSTEM 구조를 명세하고 구조화하고 문서화하기 위한 비주얼라이징 랭기지
- Modeling Language
- 
- UML사용 3가지 방법 (sketch-> bluprint->programming language)
  - sketch : 소통수단. semantic, syntatic 틀려도 됨, 인셉션 ooa까지 쓰임
  - blueprint : ood단계, code gen 직전
  - programming language : 

- 프로그래밍 언어 발전사에서 처음에는 프로그램을 Procedure관점에서 Aabstaction함. 이후 Data 관점의 abstraction

- Encapsulation of data and related operations into a single syntactic unit

  - 하나의 문법요소에 (캡슐화된)데이터와 연관 동작 관리
    - method도 구현을 노출하지 말고 prototype, signature 만 노출
    - 데이터를 바로 밖으로 노출하지 말고 캡슐화

- 장점

  - Single syntactic unit (하나의 문법적 요소)

    - Increase program organization, modfiability(Everithing associated with a data strucure is together) and separate compilation
      - 분할컴파일 가능, 수정 용이

  - Encapsulation

    - Increase reliability : by hiding the data representations, user code cannot directly access objects of the type or depend on the representation, allowing the representation to be changed without affecting user code.


# UML
- OMG(object modeling group)에서 정의한 modeling language
- visualizing, specifying, constructing and documenting artifacts of sw intensive system
 (OOA, OOD의 대상이 되는 SW intensive system 요소를 시각화/문서화/구조화/특정하는 용도로 사용 -> SRS, SDS에 사용)
- 커뮤니케이션 도구로 유용
- 개발 단계(설계, 분석 등 개발 초기 단계와 구현단계 각각에서 사용되는 diagram 다름. 개발단계별 산출물 구분 필요)
- OOA 단계 : Domain modling, Use case D (요구사항 분석에 활용) 
	- **Domain Model** : uml에 속하지 않으나 class D notation 사용. 도메인에 대한 이해를 돕고 Object identification함
- OOD 단계 : Class D, Sequence D

- UML 3 Level (3 ways of apply UML)
1. Sketch : conceptual 관점에서 그림. ooa단계의 커뮤니케이션 수단으로 사용되는 레벨. 인셉션, ooa까지 사용되는 uml들을 sketch 레벨이라 함 (intercommunication medium). syntax, semantic 덜 지켜도 됨 : 
CF) state chart : 설계 초기단계에서 요구사항 명확한 이해를 돕기 위해 사용. ooa단계
2. Blueprint : syntax, semantic 정확하게 지켜야 함 (구현자와의 오해 피함). OOD단계의 DCD, Sequence D.
ooa단계. : **Design단계에서 작성. 틀리면 안됨**
3. Programming language

## Domain Model
- uml아님. class Diagram notation 사용**
- OOD단계에서 도메인에 대한 개념적 이해 돕기 위해 사용
- Application domain의 전체에 대한 object나옴 (sw적으로 구현되지 않는 단위-법률, system boundary 밖의 시스템 등-까지 등장 )

## Use Case Diagram
- use case(시나리오)와 액터의 이름을 기술하고 그들 간 관계를 표시함
	- use case : a collection of related success and failure scenarios thant describe how an actor uses the system to achieve their goal
		- main success scenario
		- alternate scenario
	- actor : 시스템 관련 행동을 하는 사람/조직/장비(컴퓨터)
- 시스템 밖의 시스템 사용자(external actor)가 시스템 사용하는 시나리오를 텍스트로 적는 것
- system boundary를 무엇으로 잡느냐에 따라 external actor 달라질 수 있음 '
- use case D보다 use case기술한 text가 더 중요
=====
- Use Case
	- 시스템 사용자(actor)가 목적달성을 위해 시스템 사용하는 시나리오를 **텍스트**로 구성한 것
	- **요구사항 분석 도구로 사용 -capture, identify, analyze the requirement-**
	- 3단계(level) brief -> casual -> fully dressed (이 순서로 만듦. 구현 전에 brief하게 작성하고 구현진행하면서 구체화)
	- **UP기반 OOAD에서는 use case기술로 functional requirement대체** 하기 때문에 usecase가 필수요소임
	- use case를 작성하며 functional requirement 구체화함
	- srs에 functional, non functional req 들어가는데 usecase로 functional 요구사항 표현함 
	- OOAD에서만 쓰이는 것은 아님. Procedure기반 sw개발단계에서도 요구사항 수집 및 표시 용으로 사용함
	
- 3 Format use case	(brief->casual->fully deress 순서로 detailedness 늘어남)
	- Brief : 가장 기본적 / 한가지 main success scenario를 한 문단 정도로 간략하게 작성
	- Casual : **main success 시나리오와 alternative 시나리오 구분해서 작성** / informal paragraph format / 여러 시나리오 커버하는 여러개 문단
		- main success 시나리오 : 가장 일반적으로 발생하는 typical courses of event
		- alternativ 시나리오 : 가끔 발생하는 경우. 
		- exceptional 시나리오 : main 시나리오 결과로 다시 돌아오지 않는 시나리오
	- Fully dressed 시나리오(no 95) : 구현단계에 반영가능할 정도로 detailness 내려감. **OOD단계에서 여기까지**/ all steps, variations and supportiong sections (precondition같은 조건 등 상세하게 작성)
		- 항목 : preconditions(시나리오 시작 시 필요 조건이나 use case 리더가 알아야 할 사전조건 등 서술), main success scenario, extensions(alternative scenarios of success or failure)
- Use case 작성의 guide line
	- **use case 는 essential style로 작성하라** : UI-free, flexible스타일로 작성
		- Essential writing style : 구체적인 방식보다 전체적 요구사항만을 포함하도록 (<-> concrete style)
	- Black box use case 작성하라
		- internal working(implementation detail)을 작성하지 말아라.
		- Define what system does(analysis), rather than how it does it(design) -> 구현단계에 결정할 여지를 주면서 주된 사항만 작성할것
		- use case는 analysis단계의 산출물. 구체적 사항은 design단계에 작성
- Use Case Diagram
	- use case의 이름, actors(primary, secondary, supporting), 그들 간 관계 표시
	- System context Diagram (시스템 바운더리 표시)
	- A summary of all use cases
	- Actor (사람으로 제한되지 않음. 조직, sw요소 등 가능)
		1. Primary A : 직접 시스템 접근하고 사용하는
		2. Secondary A : pa에게 지시내리는? 
		3. Supporting A : SUD(System Under Discussion)에게 서비스 제공하는 단위 (ex - payment 인증시스템)
		4. Off stage A : 시스템에 관련은 있으나 use case에서 직접 시스템에 접근하거나 하지 않는..
## Class Diagram
- **static model**, structure diagram 범주에 속함
- MOF 의 M2레이어 와 M0레이어 일치하는 사례..?
- 시스템 구성하는 클래스와 클래스간의 **정적 관계**를 표시. 클래스의 attribute, operation(obj의 method) 표시
- Dynamic한 시나리오가 아닌 static한 연관관계
- 구체적 숫자 들어가지 않은 multiplicity정의
- D에서 관계의 direction 까지 표시
- **OOA(-> Domain model), OOD(-> DCD -Design Class Diagram, 디자인레벨의 CD-) 단계 둘 다 에서 사용**

## Object Diagram
- Real world의 obj와 그들 간 관계 정의에 유용
- **At a specific point of time**에서의 Class의 instance 상태에 집중 => **snapshot**

## Package Diagram
- Logical한 구조 표시 (not phisical)
- Layered 구조 정의
- 다수 class를 Package화하고 복잡한 CD를 단순화함

- PD, CD, OD, DD등을 한 장에 섞어서 전체적 시스템을 표현함

## Component Diagram
- Logical한 구조 표시
- 컴포넌트들이 서로 어떻게 연관되고 sw시스템을 구성하는지 표시 (의존관계 표시됨)
	- Component : 실제 sw개발의 단위 (logical unit. hw노드에 올라가야 physical unit이라 함)
	-> 개발업무 할당의 단위가 됨
	
## Composite Structure Diagram
- Component D를 hierachy하게 그린것. 일반적으로 component D, composite structure D 함께 표시함
- Component D의 component 내부 구조를 보여줌
- communitcation link를 통해 연결(inter connect)된 Run-time instance 표시 (cf - component가 실제 component, thread에 올라간 상태 표시는 deploy D에서)

## Deploy Diagram
- hw 노드의 static한 view의 run-time configuration(os정보 등)과 해당 node에서 run되는 sw component 표시
- 개발초기에는 나타나지 않음
- UP의 construction, transition phase에 등장 (초반인 elaboration, inception? 단계에서는 그려지지 않음)

## Sequence Diagram
- Dynamic model
- **Time sequece**에 따른 object들의 collabration 표시
- 특정 use case(시나리오)에서 object들이 어떻게 interconnect하는지를 시간순서가 드러나게 표현

## Communication Diagram
- ==**Collaboration Diagram**
- SequenceD와 비슷. sequenceD와 비교해서 time sequence보다 object간 collaboration에 focus되어 있음
- 특정 use case(시나리오)의 Dynamic한 interconnect

## Timing Diagram
- 주어진 시간 단위에서의 object 동작 표현 (**A special form of a sequence D**)
- left->right 로 시간 흐름 표현, life line으로 세로 칸 구분하여 ~`?

## Interaction Overview Diagram
- object 간 interaction의 flow of control의 overview 표현에 초점
- Activity Diagram

## 강의 더 듣고 채우기 	


- 
# 6강
- use case : sw뿐 아니라 business modling할 때 도 사용
## Class Diagram
- UML Class Diagram Notation : ooad에서 두 가지 용도로 사용됨
	- OOA 단계의 도메인모델: Domain Model로 사용 (conceptual perspective) object없고 association도 그냥 실선으로만 표시. operatoin정의 안함
						디자인단계의 클래스다이어그램 아님. 시스템을 구성하는 OBJ, OBJ와 커뮤니케이션하는 외부 도메인 단위를 찾아내는 CONCEPTUAL PERSPECTIVE 모델
	- OOD 단계의 DCD: Design Class Diagrma. (design perspective)SW로 구현할 범위만 표현. 구체적으로 multiplicity, association 등 code generaton 수준으로 표시

- Operation, attribute 표시. 값은 미표시. 속성 타입 표시

## Object Diagram
- Anonymous Object ; 너무 많이 발생해서 특정 지정할 필요 없을 때, 이름 모를 때 
- Class diagram에 표시한 사항들을 at a specific time의 상태까지 표현하는 것
- class diagram에서 operation 없앰. attribute의 값까지 표시

## Attribute syntax
- attribute default visibility : -
- operation default visibility : +
'/' : 계산되어지는 값이다 (derived attribute)

- enueration : mof m2layer

**Compoent D의 component와 Deployment D의 component 차이
- ComponentD의 comp는 일반적으로 소스코드나 개발중인 element. deploymentD의 comp는 processor 위에서 동작하는 **run-time comp**. deployD의 comp가 componentD comp의 instance(구현체).
comp d의 comp가 컴파일되어서 executable 단위가 되어 프로세스에 assign된 runtime instance
comp D의 comp는 logical 단위이고 deployD의 comp는 physical 단위. 

# UP기반의 iterative OOAD개발방법론

# OOA
- 도메인의 비지니스레벨 도메인과 클래스(conceptual obj. Domain Model) 찾아냄+ REQUIREMENT 도출(use case로 찾음)

# OOD
- SW OBJ 정의 (Class diagram)
- 각 obj가 어떻게 collaboration하며 요구사항 충족시킬지 결정 (SEQUENCE DIAGRAM)

순서 : use case 정의 -> 도메인모델 -> iteraction diagram 작성 -> 
- use case 하나당 여러개 system operation 도출. use case 하나당 sequence diagram 여러개 그림?
- main, exceptional, alternative 시나리오를 fragment operator 이용해서 한 장에 표현
- 그리다보면 operation, parameter 등 나오게 됨 -> 이것을 class diagram에 반영
- class diagram의 draft version은 domain model에서 가져옴
1. 모든 use case 뽑아서 2. sequence D그리고 3. class D에 반영 (a set of sequence diagram 과 하나으 ㅣclass D)
이것을 

UP 조건
1.
2.
3.
4.

- fragment operator (alt, opt, loop, break, seq)


# UP (Unified Process)
- 4개 phase, 9개 principles
- OO SW를 분석/설계/구현/~ 하기 위한 iterative 개발방법론
- Iterative with fixed length iterations (3주의 mini waterfall : 요구사항분석-설계-구현-테스트-릴리즈 으로 구성. 개발기능단위 기준이 아닌 시간 3주 기준으로 해야 할 일 자르는 것이 포인트. 3주에 delay있어서는 안됨)
- Incremental, evolutionary, iterative하게 risk driven, archistic centric 한 방식으로 iteration을 돌림
- Inspired from Agile
- Flexible (여러 개발 방법론 통합한 것. 다른 방법론 추가될 수 있음)
- A de-facto industry standard for developing OO sw
- **Risk-Driven and Client-Driven iterative Planning **

- Inception : requirement를 얇고 넓게 모두 찾아냄 -> risk(archistic centric risk, client risk)찾아서 관련 요구사항을 만듦. architecture 이런저런 시도, client 요구사항 이런저런 시도
- hw, sw engineer, customer, architector들이 모여서 architecture중심 discussion. client requirement 구현상황 discussion -> 클라이언트의 요구사항과 실제구현물 간 간극과 서로의 이해 차이를 좁혀서 client ok받을 때 까지 iteration. architector도 architecture 확정될 때 까지
ㅇㄹㅇㄹ
architecture sensitive한 개발항목, 결정사항들은 elaboration phase에서 완료. 이것들이 전체 요구사항의 5%정도 차지.
나머지 architecture insensitive한 항목들을 dependency 적은 항목들 우선으로 개발 시작 construction phase에서 시작.
requirement는 elaborationphase에서 fix됨
이후 requirement 고도화(refinement). use case 기준으로 brief format의 use case는 elaboration에서 확정되어야 함
requirement바뀌면 구조도 바뀌어야 하므로. construction phase부터는 requirement바뀌면 안됨

elaboration 끝나면 architecture fix, client valuable requirement 구체화 완료됨 (-> architecture centric, client side risk들이 retirement.해결된 상태가 되면 elaboration 단계 종료) -> 이 때 5%정도의 요구사항만 만들어진 것. (risk 해결된 상태까지만) 나머지 95% requirement들은 construction phase에서 만들어짐
- elaboration에서 나오는 결과물들은 proto type임
- up에는 prototype과 spiral 모델도 포함된 것임
 cf) client

- transition : deployment


## up 9 discipilne
- 