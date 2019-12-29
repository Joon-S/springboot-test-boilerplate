# SpringBoot Test Boilerplate
[![Build Status](https://travis-ci.org/Joon-S/springboot-test-boilerplate.svg?branch=master)](https://travis-ci.org/Joon-S/springboot-test-boilerplate)
![Build Status](https://img.shields.io/github/license/Joon-S/springboot-test-boilerplate)

해당 프로젝트는 __SpringBoot, JPA__ 구성되어있고 추가로 커스텀이나 세팅을 하고싶을경우에는 수정이 필요하다.
무엇보다 여러 Spring Boot 라이브러리를 쓰기위해서 만들어보았다.

1. Derby (Embedded Database)
H2 쓰기는 싫고 한번 더비를 써보고싶어서 써보았는데 별반다를건없다 번외로 `data.sql`에 테이블에 추가할 데이터들을 써놨는데
스프링부트 2.0 버전에서는 안될수도 있다는 글을 보았다. 실제로 해결하기위해 여러가지 해보았지만 못찾았다...ㅠ

2. Ehcache
`Rdis`, `Memcached` 다양한 캐시들이 있다고 했는데 `Ehcache`에 흥미가 생겨서 추가해보았다 원래 기본으로 캐시에 관한 설정을
하고싶었으나 기본에서는 지원해주지않는다. 결론 특정 데이터마다 캐시설정을 다르게하고싶은데...라고 생각했었는데 그것도 설정으로 가능하다.
덕분에 만족함

3. Validator
데이터를 처리하기전 유효성 검사하고자 추가해보았다. 내가 애용하는 Regex 도 단순하게 넣을수있어서 좋다.
>> 출처 [블로그](https://engkimbs.tistory.com/728)

```

