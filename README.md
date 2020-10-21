## Spring Boot and Indexing with Hibernate-Search

### Hibernate Search (Full-text search for entities):
Hibernate Search automatically extracts data from Hibernate ORM entities to push it to local Apache Lucene indexes or remote Elasticsearch indexes.
It features:
- Declarative mapping of entity properties to index fields, either through annotations or a programmatic API.
- On-demand mass indexing of all entities in the database, to initialize the indexes with pre-existing data.
- On-the-fly automatic indexing of entities modified through a Hibernate ORM session, to always keep the indexes up-to-date.
- A Search DSL to easily build full-text search queries and retrieve the hits as Hibernate ORM entities.

### Apache Lucene and Solr:
- Lucene Core is a Java library providing powerful indexing and search features, as well as spellchecking, hit highlighting and advanced analysis/tokenization capabilities.
- SolrTM is a high performance search server built using Lucene Core. Solr is highly scalable, providing fully fault tolerant distributed indexing, search and analytics. It exposes Lucene's features through easy to use JSON/HTTP interfaces or native clients for Java and other languages.

### Elasticsearch and Kibana:
- Elasticsearch is a distributed, RESTful search and analytics engine capable of addressing a growing number of use cases. As the heart of the Elastic Stack, it centrally stores your data for lightning fast search, fine‑tuned relevancy, and powerful analytics that scale with ease.
- Kibana is a free and open user interface that lets you visualize your Elasticsearch data and navigate the Elastic Stack. Do anything from tracking query load to understanding the way requests flow through your apps.

### Implementation:
- In order to use Hibernate Search, you should be familiar with the Hibernate ORM APIs, or the JPA APIs
- Hibernate Search is not released as part of Hibernate ORM, so its version number will often be different. 
- Hibernate Search can be run in any  environment able to run Hibernate ORM. (Java SE, Java EE containers, OSGi containers, Apache Tomcat, within Spring )

### Default Values in Configuration:
    org.hibernate.search.annotations.Store.NO
    org.hibernate.search.annotations.Index.YES
    org.hibernate.search.annotations.Analyze.YES
    
### Lucene Version:
- Lucene Version Inside Hibernate search 5.10 is 5.5 (current project):   
    - https://hibernate.org/search/releases/5.10/     
- Lucene Version Inside Hibernate search 6.00 is 8.6 (under development):     
    - https://hibernate.org/search/releases/6.0/  
- Set Lucene Version in application.properties:
    - https://stackoverflow.com/questions/25474445/spring-boot-hibernate-search-properties
    - https://docs.jboss.org/hibernate/search/5.10/reference/en-US/html_single/#_index_format_compatibility


further references:     
- https://hibernate.org/search/documentation/getting-started/
- https://lucene.apache.org/
- https://www.elastic.co/elasticsearch/
- https://www.elastic.co/kibana


### Project Descriptions:
please see application.properties files in resources folder and select a active profile "dev" or "com" to run project. you can check test methods too.  

### IntellliJ IDEA Configurations:
- IntelijIDEA: Help -> Edit Custom Vm Options -> add these two line:
    - -Dfile.encoding=UTF-8
    - -Dconsole.encoding=UTF-8
- IntelijIDEA: File -> Settings -> Editor -> File Encodings-> Project Encoding: form "System default" to UTF-8. May be it affected somehow.
- IntelijIDEA: File -> Settings -> Editor -> General -> Code Completion -> check "show the documentation popup in 500 ms"
- IntelijIDEA: File -> Settings -> Editor -> General -> Auto Import -> check "Optimize imports on the fly (for current project)"
- IntelijIDEA: File -> Settings -> Editor -> Color Scheme -> Color Scheme Font -> Scheme: Default -> uncheck "Show only monospaced fonts" and set font to "Tahoma"
- IntelijIDEA: Run -> Edit Configuration -> Spring Boot -> XXXApplication -> Environment -> VM Options: -Dspring.profiles.active=dev

<hr/>
<a href="mailto:eng.motahari@gmail.com?"><img src="https://img.shields.io/badge/gmail-%23DD0031.svg?&style=for-the-badge&logo=gmail&logoColor=white"/></a>

