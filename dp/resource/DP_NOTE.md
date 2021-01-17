## Pattern

- reusability 높임
- flexibility 높임
- 3 part rule of design pattern
  - Context : 자주 발생하는 상황  (recurring situation)
  - Problem : context에서 풀고자 하는 목표. 제약사항이 있음
  - Solution : 설계패턴이 제시하는 해답. 어떤 컴포넌트 가져야 하고 그들 간 관계는 어떤지, 런타임 메카니즘이 어떻게 되는지
- 풀고자 하는 목표 + 제약사항 피하면서 
- 

```



## Factory Method
- Creational Pattern의 일종
    - Creational Pattern
        - 명시적으로 new 쓰지 않고 생성하는 방법
        - client 코드 수정 없이 다른 object 생성 및 사용 가능
        - Factory method, Abstract Factory, Singletone, Builder, Prototype
        
- Factory Method : 어떤 객체 생성할지를 결정할 때 inheritance 개념 사용. 객체 생성을 Factory Class에 위임 (Class 레벨) 
- Abstract Factory : Factry object에 객체 생성을 위임 (Object 레벨)   
```

# Strategy Pattern
- Behavior Pattern에 속함
- 관련 class들의 유일한 차이점이 그들의 behavior일 때 사용하는
- 동일 operation을 수행하는 서로 다른 algo가 다양하게 존재할 때 사용하는
- class의 behavior가 runtime에 결정
- 조건에 따른 behavior수행을 conditional statement로 관리하기 복잡하기 때문에 사용하는
- 특정 목적의 operation을 정의할 때, operation을 수행하는 encaptulate 된 알고리즘을 바꿔끼면서 실행하도록 할 때 사용하는
- 변하는 것과 변하지 않는 것을 구분하여 설계** -> 변화하지 않는 부분 공통화한 class 재사용성 높아짐
- 재사용성 높임
- 영향도를 최소화하면서 요구사항 변화 대응 가능
- Favor (object)Composition rather than (class)inheritance (coupling 낮춤. Contain instances of other classes implementing desired functionallity)
- Delegation (Pass method call to composed obj)
- 사용하는 측에 제공하는 인터페이스 그대로 두고 concrete class 추가해가는 방식으로 변경 확장
- composition, delegation (composition 관계의 클래스를 참조하여 해당 객체에 delegation하는 방식 - composition object통해 method call해서 기능 delegation) 
- Composing objects principle - Favor composition over inheritance 
- 상속은 coupling 강함. decoupling을 통해 flexibility 강화
- 공통으로 수행해야 하는 behavior를 interface화하여 interface객체를 abstract class가 가지게 한다.(interface 객체와 abstract class 객체가 composition 관계에 있게 한 후 abstract class의 method에서 interface 객체 method를 call하게 함으로서 operation수행을 delegate한다)

# Observdr Pattern
- one to many relationship
- loose coupling between subject and Behavior.strategy.observer (interact but know each other very little)
- 할리웃 패턴?

# Template pattern
- framework구성에 활용
- hook method를 두어 derived class에서 조건 걸 권한을 줌

concrete한 interface는 자기으 ㅣrepresentation고려해서 abstact method 구현하면 됨

# iterator
내부자료구조를 외부에 노출하지 않게 해줌
srp principle (aggregation-집합-과 iteration 분리 : cohesion)

#state pattern
state객체에게 주어진 request forecast해줌
객체 behavior가 객체 state에 디펜던시 가지고 있을 때

an alternative to putting lots of conditionals in the context

there is a Behavior.strategy object that is most appropriate for a context object
STRATEGY 패턴의 경우 context에 적합한 전략이 1개임 그래서 하나의 context에서 수행하는 operation이 바뀌는 빈도가 STATE에 비해서 적음. STATE패턴은 하나의 CONTEXT안에서 상태변화에 따라 OPERATION 달라짐


factory method : 무엇을 할지는 abstract class에서 정의하고 생성은 sub class에 위임





## Creational Pattern

 - 명시적으로 new 쓰지 않고 생성하는 방법
      - client 코드 수정 없이 다른 object 생성 및 사용 가능
      - Factory method, Abstract Factory, Singletone, Builder,  Prototype

### Factory Method

- 객체생성을 factory클래스에서 abstract product class 객체를 가지고 있고 abstract method에서 하도록 설정하여 concrete factory class들에서 생성하도록 하고 생성된
- 생성 이외의 공통 operation은 
- 
- 클래스 레벨 패턴
- 객체의 생성을 Factory Class에 위임
  - -> Concrete class로의 dependency 낮춰서 변화의 전파 낮춤(decoupling)
- 목적 : Object 생성 **메소드**를 노출하고, sub class가 실제 생성 프로세스 컨트롤 하게 함 ( create method를 abstract로 두고 실제 구현을 concrete class에서 하게 함?)
- 용도
  - sub class가 어떤 object 생성할지를 결정. subclass. subclass에 생성을 위임
- abstract factory class는 abstract product class 만 알고 있음
- concrete factory class가 create() 구현하여 concrete product 생성
- store과 pizza creation 묶는 프레임워크
- 생성된 product 사용하는 공통코드를 abstract class의 default method로 구현해두고, product생성은 별도 abstract method를 만들어서 하위 concrete class에서 생성하도록 함
- Factory class는 일종의 framework 기능. 공통기능은 정의해두고, 실제 객체 생성은 **sub class**에 위임

### Abstact Factory Pattern

- Object level의 Creational pattern
- Abstract factory가 abstract product만을 알고 있고, concrete product가 set of element들을 관리함.
- Abstract factory에서 toolkits 생성 abstract method 가짐 (set of elements들 알고 있음)
- Concrete factory들이 abstract method 구현 (toolkits) : factory가 여러개 element를 생성함으로써 sets 관리 (like look and feel)
- Set of elements의 element끼리 concrete factory object를 공유하면서 그에 맞는 concrete 
- concrete product가 concrete factory 받아서 factory가 element creaate 하게 함
- **Client는 concrete factory, product는 접근하지 않고 abstract(interface)만 알고 있음 (세부 concrete 변경되도라도 영향무)**
- 시스템이 families of product 로 구성되어 있고 그 product들은 함께 설계되고 제약조건이 공통적으로 적용되어야 할 때 사용
- 새로운  family set 생기면 쉬움. new kind of product 생기면 변경점 많아짐
- Prototype pattern과 유사(proto type은 factory 여러개 생성필요 없음)
- DIP(Dependency Inversion Principle) : abstract에 의존. concrete에는 의존 안함
- abstract product만을 아는 인터페이스에게 families of object 를 알려줌
- concrete product(object)가 families of object 생성



역할별로 class를 분리함으로써 하나의 변화가 여러 군ㄷ에 전파되지 않도록 함
추상객체가 한 class의 변화를 그를 알고 있는 class로 전파되는 것을 막는 barrier역할
(a<-b 이면 b가 a를 알고 있는 것. a가 변하면 b까지 변화가 propagate됨)
키워드 정리