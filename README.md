# spring-boot-issue-9498

Spring Boot Error Sample for https://github.com/spring-projects/spring-boot/issues/9498

## About Views

* `SimpleView` (`/simple`)

  Extended `AbstractView`.

* `ExcelView` (`/excel`)

  Extended `AbstractXlsxView`.

## About Spring Bean Definition Profiles

* `default`

  Resolve view from `@Controller`.
  `SimpleView` is resolved, but `ExcelView` is not resolved.

* `view-controller`

  Resolve view from `ViewController`.
  `SimpleView` and `ExcelView` are not resolved.

* `workaround`

  Resolve view from `ViewController`.
  Set `spring.thymeleaf.excluded-view-names` property and `ViewResolverRegistry#beanName()` method.
  `SimpleView` and `ExcelView` are resolved!

## How to Run

```console
mvn clean verify spring-boot:run -Drun.profiles={profile}
```

test
