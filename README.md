# 🚗 Sistema Automotivo - Spring Boot + React

Sistema de gerenciamento de veículos, marcas e modelos desenvolvido com Spring Boot no backend e React no frontend. O objetivo principal é oferecer uma API REST robusta para operações de cadastro, consulta e manutenção de dados automotivos.



## 🔧 Tecnologias Utilizadas

### Backend (Spring Boot):
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok *( com getters/setters, etc.)*
- Configuração de CORS personalizada *(permitindo a comunicação entre o frontend e a API)*

### Frontend (React):
- React.js
- Axios *(para requisições HTTP)*



## 🧱 Arquitetura Utilizada

### Padrão MVC (Model-View-Controller):

- **Model**: Representa os dados e as regras de negócio da aplicação. No Spring, são as classes que mapeiam entidades do banco de dados, como `Veiculo.java`, `Marca.java`, `Modelo.java`.
- **View**: A interface com o usuário. Neste projeto, a View está implementada em um projeto React separado, que consome a API.
- **Controller**: Responsável por receber as requisições HTTP, acionar os serviços e retornar as respostas adequadas. Ex: `VeiculoController.java`, `MarcaController.java`, etc.



## 🧩 Funcionalidades

- ✅ CRUD de Marcas
- ✅ CRUD de Modelos (relacionados à Marca)
- ✅ CRUD de Veículos (relacionados à Marca e Modelo)
- ✅ Filtros e consultas com base nos dados dos veículos
- ✅ Integração completa com o frontend via API REST
- ✅ Arquitetura organizada por camadas (Controller, Service, Repository, Model)


