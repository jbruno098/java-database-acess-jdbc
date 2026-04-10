# 📦 Projeto DAO JDBC - Java

Projeto desenvolvido durante os estudos de **Java Orientado a Objetos** com foco em acesso a banco de dados utilizando o padrão **DAO (Data Access Object)** e a API **JDBC**.

O objetivo do projeto foi compreender na prática como aplicações backend Java realizam operações CRUD diretamente no banco de dados, sem o uso de frameworks como Spring ou Hibernate.

## Projeto relacionado

Também desenvolvi uma segunda versão deste projeto utilizando Spring Boot e JPA.

- Versão Spring Boot: https://github.com/jbruno098/java-database-access-springboot
---

## 🚀 Tecnologias utilizadas

* Java 17+
* JDBC (Java Database Connectivity)
* MySQL
* SQL
* Padrão DAO
* Programação Orientada a Objetos (POO)

---

## 🧠 Conceitos praticados

* Conexão com banco de dados via JDBC
* PreparedStatement
* ResultSet
* Tratamento de exceções personalizadas
* CRUD completo
* Separação de responsabilidades
* Injeção de dependência via Factory
* Mapeamento Objeto-Relacional manual (ORM básico)

---

## 📂 Estrutura do projeto

```
src
 ├── application
 │    ├── Program.java
 │    └── Program2.java
 │
 ├── db
 │    ├── DB.java
 │    ├── DbException.java
 │    └── DbIntegrityException.java
 │
 ├── model_dao
 │    ├── DaoFactory.java
 │    ├── DepartmentDao.java
 │    └── SellerDao.java
 │
 ├── model_dao_impl
 │    ├── DepartmentDaoJDBC.java
 │    └── SellerDaoJDBC.java
 │
 └── model_entities
      ├── Department.java
      └── Seller.java
```

---

## ⚙️ Funcionalidades implementadas

### Department

* ✅ Insert
* ✅ Update
* ✅ Delete by Id
* ✅ Find by Id
* ✅ Find All

### Seller

* ✅ Insert
* ✅ Update
* ✅ Delete by Id
* ✅ Find by Id
* ✅ Find All
* ✅ Find by Department

---

## 🗄️ Banco de Dados

O projeto utiliza MySQL.

Configuração feita através do arquivo:

```
db.properties
```

Exemplo:

```
user=root
password=123456
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false
```

---

## ▶️ Como executar o projeto

1. Clonar o repositório:

```
git clone https://github.com/SEU-USUARIO/NOME-DO-REPO.git
```

2. Criar o banco MySQL e importar o script SQL.

3. Configurar o arquivo `db.properties`.

4. Executar a classe:

```
application.Program
```

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com fins educacionais para entender o funcionamento interno de frameworks backend Java, aprendendo primeiro a implementação manual utilizando JDBC antes do uso de ferramentas como:

* Spring Boot
* JPA / Hibernate

---

## 📈 Aprendizados

Durante o desenvolvimento foram compreendidos conceitos fundamentais do backend Java:

* Como o Java se comunica com bancos relacionais
* Como frameworks abstraem o acesso a dados
* Organização em camadas (DAO Pattern)
* Boas práticas de acesso a dados

---

## 👨‍💻 Autor

Desenvolvido por **Joelson Bruno**
Estudante de Análise e Desenvolvimento de Sistemas.

🔗 LinkedIn: (linkedin.com/in/joelson-bruno-734106389)
🔗 GitHub: (github.com/jbruno098)

---

⭐ Projeto desenvolvido para fins de estudo e evolução profissional.
