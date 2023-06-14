[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/API-Rest-Place-Service/blob/main/LICENSE)

<h1 align="center">API Rest Place Service</h1>

<p align="center"><img width="500px" src="https://github.com/lucarauj/assets/blob/main/Spring.png" /></p>

## Tecnologias:

- Spring Boot
- Spring Webflux
- Spring Data + R2DBC
- Slugify

<br>

## Práticas adotadas:

- SOLID
- Testes automatizados
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Injeção de Dependências
- Geração de slugs automática com o Slugify
- Auditoria sobre criação e atualização da entidade

<br>

## API Endpoints

- POST (http://localhost:8080/places)
```
{
  "name": "New Place",
  "state": "New State"
}
```

<br>

## Dependências:

- Spring Reactive Web
- Spring Data R2DBC
- Spring Boot DevTools
- H2 Database
- Slugify
- Validation

<br>

## Testes:

<p align="left"><img width="500px" src="https://github.com/lucarauj/API-Rest-Place-Service/blob/main/images/test.png" /></p>

<br>

## Anotações:

- @Autowired: Utilizada para injetar dependências automaticamente em uma classe, permitindo que você obtenha uma instância de uma classe necessária sem criar manualmente;
- @Bean: indica que o Spring deve invocar aquele método e gerenciar o objeto retornado por ele;
- @Configuration: indica que a classe possui métodos que expõe novos beans;
- @CreatedDate: recurso de auditoria fornecido pelo Spring Data JPA, que ajuda a rastrear informações como quem criou ou modificou um registro em um banco de dados. Ele trabalha em conjunto com outras anotações, como "@CreatedBy" e "@LastModifiedDate", que capturam informações adicionais relacionadas à criação e modificação de registros;
- @EnableR2dbcAuditing: responsável por configurar o mecanismo de auditoria no contexto do Spring;
- @LastModifiedDate: utilizada para rastrear quando o código foi modificado pela última vez;
- @NotBlank: valida se o campo se encontra vazio ou nulo;
- @PostMapping: usada para mapear solicitações HTTP POST em métodos específicos de manipulador;
- @RestController: Usada para marcar uma classe como um controller no padrão MVC (Model-View-Controller) do Spring;
- @RequestMapping: Especifica a URL que um método do controlador irá manipular;
- @RequestBody: Usada para injetar o body de uma requisição nos parâmetros do método do controller que foi chamado para tratar essa requisição;
- @Test: anotação que define um método teste;
- @Valid: indica que o valor do objeto virá do corpo da requisição;

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
