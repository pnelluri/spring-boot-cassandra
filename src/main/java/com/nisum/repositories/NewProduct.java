package com.nisum.repositories;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.mapping.CassandraType;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
@Table("productsnew")
public class NewProduct {

	/**
	 * Created by jt on 1/10/17.
	 */


	    @PrimaryKey
	    @CassandraType(type = DataType.Name.UUID)
	    private UUID id;
	    private String description;
	    private BigDecimal price;
	    public String getNarration() {
			return narration;
		}

		public void setNarration(String narration) {
			this.narration = narration;
		}
		private String imageUrl;
	    public String getReamrks() {
			return reamrks;
		}

		public void setReamrks(String reamrks) {
			this.reamrks = reamrks;
		}
		private String narration;
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

	    public NewProduct() {
	        id = UUID.randomUUID();
	    }

}
