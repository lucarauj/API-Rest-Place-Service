# API Rest Place Service

## Tecnologias:

- Spring Boot
- Spring Webflux
- Spring Data + R2DBC
- Slugify

## Práticas adotadas:

- SOLID
- Testes automatizados
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Injeção de Dependências
- Geração de slugs automática com o Slugify
- Auditoria sobre criação e atualização da entidade

## API Endpoints

- POST (http://localhost:8080/places)
```
{
  "name": "New Place",
  "state": "New State"
}
```

## Dependências:

- Spring Reactive Web
- Spring Data R2DBC
- Spring Boot DevTools
- H2 Database
- Slugify
- Validation

## Anotações:

- @Autowired
- @Bean
- @Configuration
- @CreatedDate
- @EnableR2dbcAuditing
- @LastModifiedDate
- @NotBlank
- @PostMapping
- @RestController
- @RequestMapping
- @RequestBody
- @Test
- @Valid