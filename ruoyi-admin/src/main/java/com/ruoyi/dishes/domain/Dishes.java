package com.ruoyi.dishes.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜品列表对象 dishes
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public class Dishes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 菜品名称 */
    @Excel(name = "菜品名称")
    private String name;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 类型:主食/面食 */
    @Excel(name = "类型:主食/面食")
    private String type;

    /** 图片 */
    @Excel(name = "图片")
    private String image;

    /** 描述 */
    @Excel(name = "描述")
    private String depict;

    /** 备注 */
    @Excel(name = "备注")
    private String remake;

    /** 库存 */
    @Excel(name = "库存")
    private Integer stock;

    /** 1:上架,0:下架 */
    @Excel(name = "1:上架,0:下架")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setDepict(String depict) 
    {
        this.depict = depict;
    }

    public String getDepict() 
    {
        return depict;
    }
    public void setRemake(String remake) 
    {
        this.remake = remake;
    }

    public String getRemake() 
    {
        return remake;
    }
    public void setStock(Integer stock) 
    {
        this.stock = stock;
    }

    public Integer getStock() 
    {
        return stock;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("price", getPrice())
            .append("type", getType())
            .append("image", getImage())
            .append("depict", getDepict())
            .append("remake", getRemake())
            .append("stock", getStock())
            .append("status", getStatus())
            .toString();
    }
}
