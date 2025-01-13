# Spring Boot Edge Microservices  

Ce projet est un exemple d'architecture de microservices réalisé dans le cadre d'une initiative personnelle visant à explorer les concepts avancés de développement logiciel avec Spring Boot et Spring Cloud. L'objectif est de concevoir une application modulaire, robuste et scalable,
Le projet s'appuie sur le cours "Optimisez votre architecture Microservices" proposé par OpenClassrooms.

## Microservices
Ce projet inclut les microservices suivants :

- **Gestion des produits**  
- **Gestion des utilisateurs**  
- **Gestion des commandes**  
- **Gestion des paiements**
  
Chaque microservice est autonome et communique avec les autres via des API REST, garantissant une architecture modulaire.

## Serveurs

Les serveurs jouent un rôle crucial dans la coordination des microservices. Ils fournissent des services spécifiques pour gérer les communications, les configurations et la supervision des interactions entre les composants. Ce projet utilise les serveurs suivants :  

- **Serveur de configuration (Spring Cloud Config)**  
- **Serveur de découverte (Eureka)**  
- **API Gateway (Spring Cloud Gateway)** 
- **Serveur de traçage (Zipkin)**

## Architecture

- **Feign**  
  Simplifie la communication entre les microservices en générant automatiquement des clients REST.  

- **Spring Cloud Config**  
  Centralise la gestion des configurations dans un dépôt Git unique pour garantir la cohérence à travers les environnements.
  
- **Spring Cloud Load Balancer**  
  Équilibre les charges en distribuant automatiquement les appels entre les différentes instances d’un même service, garantissant une répartition optimale du trafic.

- **Eureka**  
  Agit comme un registre de services, permettant aux microservices de se découvrir et de communiquer dynamiquement sans avoir besoin de connaître leurs adresses exactes.  

- **Spring Cloud Gateway**  
  Sert de proxy inversé pour gérer le routage des appels, appliquer des règles de sécurité, et centraliser les requêtes.  

- **Zipkin**  
  Permet de tracer les requêtes entre les microservices, offrant une meilleure visibilité et facilitant le diagnostic des problèmes.
