
#### 카테고리 조회
```mysql
-- 카테고리 셀프조인 (부모의 이름은 엔티티에 어떻게 담을까?)
SELECT parent.name, child.name, child.ordering
FROM category child INNER JOIN category parent ON parent.id = child.parent_id
WHERE child.id != 0 ORDER BY child.ordering;

-- 카테고리 대분류만 
SELECT * FROM category WHERE id = 0 ORDER BY ordering;
-- 카테고리 소분류만
SELECT * FROM category WHERE id != 0 ORDER BY ordering;


-- Product 조회


```
2018-11-18 23:59:07.192  INFO 3019 --- [           main] o.s.t.c.transaction.TransactionContext   : Began transaction (1) for test context [DefaultTestContext@229d10bd testClass = ProductRepositoryTests, testInstance = com.jmt.bbang.repository.ProductRepositoryTests@647fd8ce, testMethod = 이름으로검색@ProductRepositoryTests, testException = [null], mergedContextConfiguration = [MergedContextConfiguration@47542153 testClass = ProductRepositoryTests, locations = '{}', classes = '{class com.jmt.bbang.BbangApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTestContextBootstrapper=true}', contextCustomizers = set[[ImportsContextCustomizer@33afa13b key = [org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration, org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration, org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration, org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration, org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration, org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration, org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration, org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration, org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration, org.springframework.boot.test.autoconfigure.jdbc.TestDatabaseAutoConfiguration, org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManagerAutoConfiguration]], org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@319b92f3, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@31f924f5, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.autoconfigure.OverrideAutoConfigurationContextCustomizerFactory$DisableAutoConfigurationContextCustomizer@1da51a35, org.springframework.boot.test.autoconfigure.filter.TypeExcludeFiltersContextCustomizer@351584c0, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@409347f, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@5f71c76a], contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map[[empty]]]; transaction manager [org.springframework.orm.jpa.JpaTransactionManager@31f77791]; rollback [true]
Hibernate: 
    select
        product0_.id as id1_8_0_,
        category1_.id as id1_1_1_,
        product0_.category_id as categor14_8_0_,
        product0_.cutting as cutting2_8_0_,
        product0_.deleted as deleted3_8_0_,
        product0_.discount as discount4_8_0_,
        product0_.hit as hit5_8_0_,
        product0_.nutrition as nutritio6_8_0_,
        product0_.point_rate as point_ra7_8_0_,
        product0_.price as price8_8_0_,
        product0_.product_name as product_9_8_0_,
        product0_.quantity as quantit10_8_0_,
        product0_.regdate as regdate11_8_0_,
        product0_.total_sales as total_s12_8_0_,
        product0_.update_date as update_13_8_0_,
        category1_.name as name2_1_1_,
        category1_.ordering as ordering3_1_1_,
        category1_.parent_id as parent_i4_1_1_ 
    from
        product product0_ 
    inner join
        category category1_ 
            on product0_.category_id=category1_.id 
    where
        product0_.product_name like concat('%', ?, '%')
Hibernate: 
    select
        purchasepr0_.id as id1_12_3_,
        purchasepr0_.price as price2_12_3_,
        purchasepr0_.product_id as product_4_12_3_,
        purchasepr0_.quantity as quantity3_12_3_,
        purchasepr0_.refund_id as refund_i5_12_3_,
        product1_.id as id1_8_0_,
        product1_.category_id as categor14_8_0_,
        product1_.cutting as cutting2_8_0_,
        product1_.deleted as deleted3_8_0_,
        product1_.discount as discount4_8_0_,
        product1_.hit as hit5_8_0_,
        product1_.nutrition as nutritio6_8_0_,
        product1_.point_rate as point_ra7_8_0_,
        product1_.price as price8_8_0_,
        product1_.product_name as product_9_8_0_,
        product1_.quantity as quantit10_8_0_,
        product1_.regdate as regdate11_8_0_,
        product1_.total_sales as total_s12_8_0_,
        product1_.update_date as update_13_8_0_,
        category2_.id as id1_1_1_,
        category2_.name as name2_1_1_,
        category2_.ordering as ordering3_1_1_,
        category2_.parent_id as parent_i4_1_1_,
        refund3_.id as id1_13_2_,
        refund3_.reason as reason2_13_2_,
        refund3_.regdate as regdate3_13_2_,
        refund3_.status as status4_13_2_ 
    from
        purchase_product purchasepr0_ 
    left outer join
        product product1_ 
            on purchasepr0_.product_id=product1_.id 
    left outer join
        category category2_ 
            on product1_.category_id=category2_.id 
    left outer join
        refund refund3_ 
            on purchasepr0_.refund_id=refund3_.id 
    where
        purchasepr0_.product_id=?
Hibernate: 
    select
        purchasepr0_.id as id1_12_3_,
        purchasepr0_.price as price2_12_3_,
        purchasepr0_.product_id as product_4_12_3_,
        purchasepr0_.quantity as quantity3_12_3_,
        purchasepr0_.refund_id as refund_i5_12_3_,
        product1_.id as id1_8_0_,
        product1_.category_id as categor14_8_0_,
        product1_.cutting as cutting2_8_0_,
        product1_.deleted as deleted3_8_0_,
        product1_.discount as discount4_8_0_,
        product1_.hit as hit5_8_0_,
        product1_.nutrition as nutritio6_8_0_,
        product1_.point_rate as point_ra7_8_0_,
        product1_.price as price8_8_0_,
        product1_.product_name as product_9_8_0_,
        product1_.quantity as quantit10_8_0_,
        product1_.regdate as regdate11_8_0_,
        product1_.total_sales as total_s12_8_0_,
        product1_.update_date as update_13_8_0_,
        category2_.id as id1_1_1_,
        category2_.name as name2_1_1_,
        category2_.ordering as ordering3_1_1_,
        category2_.parent_id as parent_i4_1_1_,
        refund3_.id as id1_13_2_,
        refund3_.reason as reason2_13_2_,
        refund3_.regdate as regdate3_13_2_,
        refund3_.status as status4_13_2_ 
    from
        purchase_product purchasepr0_ 
    left outer join
        product product1_ 
            on purchasepr0_.product_id=product1_.id 
    left outer join
        category category2_ 
            on product1_.category_id=category2_.id 
    left outer join
        refund refund3_ 
            on purchasepr0_.refund_id=refund3_.id 
    where
        purchasepr0_.product_id=?
Hibernate: 
    select
        purchasepr0_.id as id1_12_3_,
        purchasepr0_.price as price2_12_3_,
        purchasepr0_.product_id as product_4_12_3_,
        purchasepr0_.quantity as quantity3_12_3_,
        purchasepr0_.refund_id as refund_i5_12_3_,
        product1_.id as id1_8_0_,
        product1_.category_id as categor14_8_0_,
        product1_.cutting as cutting2_8_0_,
        product1_.deleted as deleted3_8_0_,
        product1_.discount as discount4_8_0_,
        product1_.hit as hit5_8_0_,
        product1_.nutrition as nutritio6_8_0_,
        product1_.point_rate as point_ra7_8_0_,
        product1_.price as price8_8_0_,
        product1_.product_name as product_9_8_0_,
        product1_.quantity as quantit10_8_0_,
        product1_.regdate as regdate11_8_0_,
        product1_.total_sales as total_s12_8_0_,
        product1_.update_date as update_13_8_0_,
        category2_.id as id1_1_1_,
        category2_.name as name2_1_1_,
        category2_.ordering as ordering3_1_1_,
        category2_.parent_id as parent_i4_1_1_,
        refund3_.id as id1_13_2_,
        refund3_.reason as reason2_13_2_,
        refund3_.regdate as regdate3_13_2_,
        refund3_.status as status4_13_2_ 
    from
        purchase_product purchasepr0_ 
    left outer join
        product product1_ 
            on purchasepr0_.product_id=product1_.id 
    left outer join
        category category2_ 
            on product1_.category_id=category2_.id 
    left outer join
        refund refund3_ 
            on purchasepr0_.refund_id=refund3_.id 
    where
        purchasepr0_.product_id=?
Hibernate: 
    select
        purchasepr0_.id as id1_12_3_,
        purchasepr0_.price as price2_12_3_,
        purchasepr0_.product_id as product_4_12_3_,
        purchasepr0_.quantity as quantity3_12_3_,
        purchasepr0_.refund_id as refund_i5_12_3_,
        product1_.id as id1_8_0_,
        product1_.category_id as categor14_8_0_,
        product1_.cutting as cutting2_8_0_,
        product1_.deleted as deleted3_8_0_,
        product1_.discount as discount4_8_0_,
        product1_.hit as hit5_8_0_,
        product1_.nutrition as nutritio6_8_0_,
        product1_.point_rate as point_ra7_8_0_,
        product1_.price as price8_8_0_,
        product1_.product_name as product_9_8_0_,
        product1_.quantity as quantit10_8_0_,
        product1_.regdate as regdate11_8_0_,
        product1_.total_sales as total_s12_8_0_,
        product1_.update_date as update_13_8_0_,
        category2_.id as id1_1_1_,
        category2_.name as name2_1_1_,
        category2_.ordering as ordering3_1_1_,
        category2_.parent_id as parent_i4_1_1_,
        refund3_.id as id1_13_2_,
        refund3_.reason as reason2_13_2_,
        refund3_.regdate as regdate3_13_2_,
        refund3_.status as status4_13_2_ 
    from
        purchase_product purchasepr0_ 
    left outer join
        product product1_ 
            on purchasepr0_.product_id=product1_.id 
    left outer join
        category category2_ 
            on product1_.category_id=category2_.id 
    left outer join
        refund refund3_ 
            on purchasepr0_.refund_id=refund3_.id 
    where
        purchasepr0_.product_id=?
Hibernate: 
    select
        purchasepr0_.id as id1_12_3_,
        purchasepr0_.price as price2_12_3_,
        purchasepr0_.product_id as product_4_12_3_,
        purchasepr0_.quantity as quantity3_12_3_,
        purchasepr0_.refund_id as refund_i5_12_3_,
        product1_.id as id1_8_0_,
        product1_.category_id as categor14_8_0_,
        product1_.cutting as cutting2_8_0_,
        product1_.deleted as deleted3_8_0_,
        product1_.discount as discount4_8_0_,
        product1_.hit as hit5_8_0_,
        product1_.nutrition as nutritio6_8_0_,
        product1_.point_rate as point_ra7_8_0_,
        product1_.price as price8_8_0_,
        product1_.product_name as product_9_8_0_,
        product1_.quantity as quantit10_8_0_,
        product1_.regdate as regdate11_8_0_,
        product1_.total_sales as total_s12_8_0_,
        product1_.update_date as update_13_8_0_,
        category2_.id as id1_1_1_,
        category2_.name as name2_1_1_,
        category2_.ordering as ordering3_1_1_,
        category2_.parent_id as parent_i4_1_1_,
        refund3_.id as id1_13_2_,
        refund3_.reason as reason2_13_2_,
        refund3_.regdate as regdate3_13_2_,
        refund3_.status as status4_13_2_ 
    from
        purchase_product purchasepr0_ 
    left outer join
        product product1_ 
            on purchasepr0_.product_id=product1_.id 
    left outer join
        category category2_ 
            on product1_.category_id=category2_.id 
    left outer join
        refund refund3_ 
            on purchasepr0_.refund_id=refund3_.id 
    where
        purchasepr0_.product_id=?
Hibernate: 
    select
        purchasepr0_.id as id1_12_3_,
        purchasepr0_.price as price2_12_3_,
        purchasepr0_.product_id as product_4_12_3_,
        purchasepr0_.quantity as quantity3_12_3_,
        purchasepr0_.refund_id as refund_i5_12_3_,
        product1_.id as id1_8_0_,
        product1_.category_id as categor14_8_0_,
        product1_.cutting as cutting2_8_0_,
        product1_.deleted as deleted3_8_0_,
        product1_.discount as discount4_8_0_,
        product1_.hit as hit5_8_0_,
        product1_.nutrition as nutritio6_8_0_,
        product1_.point_rate as point_ra7_8_0_,
        product1_.price as price8_8_0_,
        product1_.product_name as product_9_8_0_,
        product1_.quantity as quantit10_8_0_,
        product1_.regdate as regdate11_8_0_,
        product1_.total_sales as total_s12_8_0_,
        product1_.update_date as update_13_8_0_,
        category2_.id as id1_1_1_,
        category2_.name as name2_1_1_,
        category2_.ordering as ordering3_1_1_,
        category2_.parent_id as parent_i4_1_1_,
        refund3_.id as id1_13_2_,
        refund3_.reason as reason2_13_2_,
        refund3_.regdate as regdate3_13_2_,
        refund3_.status as status4_13_2_ 
    from
        purchase_product purchasepr0_ 
    left outer join
        product product1_ 
            on purchasepr0_.product_id=product1_.id 
    left outer join
        category category2_ 
            on product1_.category_id=category2_.id 
    left outer join
        refund refund3_ 
            on purchasepr0_.refund_id=refund3_.id 
    where
        purchasepr0_.product_id=?
==================
1, 우유식빵, 2000, 100%, 
3, 단팥빵, 1000, 100%, 
4, 호밀빵, 3000, 100%, 
5, 슈크림빵, 1000, 30%, 
6, 랜덤빵, 2000, 60%%, 
7, 죽빵, 100, 60%%, 
==================
2018-11-18 23:59:07.290  INFO 3019 --- [           main] o.s.t.c.transaction.TransactionContext   : Rolled back transaction for test: [DefaultTestContext@229d10bd testClass = ProductRepositoryTests, testInstance = com.jmt.bbang.repository.ProductRepositoryTests@647fd8ce, testMethod = 이름으로검색@ProductRepositoryTests, testException = [null], mergedContextConfiguration = [MergedContextConfiguration@47542153 testClass = ProductRepositoryTests, locations = '{}', classes = '{class com.jmt.bbang.BbangApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTestContextBootstrapper=true}', contextCustomizers = set[[ImportsContextCustomizer@33afa13b key = [org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration, org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration, org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration, org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration, org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration, org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration, org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration, org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration, org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration, org.springframework.boot.test.autoconfigure.jdbc.TestDatabaseAutoConfiguration, org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManagerAutoConfiguration]], org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@319b92f3, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@31f924f5, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.autoconfigure.OverrideAutoConfigurationContextCustomizerFactory$DisableAutoConfigurationContextCustomizer@1da51a35, org.springframework.boot.test.autoconfigure.filter.TypeExcludeFiltersContextCustomizer@351584c0, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@409347f, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@5f71c76a], contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map[[empty]]]
