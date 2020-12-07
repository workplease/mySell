package com.zzz.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 19:49
 * @Version: 1.0
 * 类目对象
 */
@Entity(name = "product_category")
@DynamicUpdate//动态更新
@Data
public class ProductCategory {

    //类目id
    @Id
    @GeneratedValue
    private Integer categoryId;

    //类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
