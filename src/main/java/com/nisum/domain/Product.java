package com.nisum.domain;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.mapping.CassandraType;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;

@Table("products")
public class Product implements Serializable{

    @PrimaryKey
    @CassandraType(type = DataType.Name.UUID)
    private UUID id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    public String getReamrks() {
		return reamrks;
	}

	public void setReamrks(String reamrks) {
		this.reamrks = reamrks;
	}

	private String reamrks;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Product() {
        id = UUID.randomUUID();
    }
}
