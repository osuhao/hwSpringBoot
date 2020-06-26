package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8797696557062872861L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;
	
	@Column(name = "name") //이름
	private String name;
	
	@Column(name = "category") //카테고리
	private String category;
	
	@Column(name = "price") //가격 
	private int price;
	
	//제조업체
	private String manufacturer;
	
	@Column(name = "unit_in_stock")//재고량
	private int unitInStock;
	
	//기술
	private String description;
	
	public Product(String name, String category) {
		this.name = name;
		this.category = category;
		this.price = 30;
		this.unitInStock = 0;
		this.manufacturer = "samsung";
		this.description = "좋은기계";
	}

}