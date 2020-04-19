package com.techhunters.borrowmyproducts.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Category")
public class Category {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Category_Id")
	private int categoryId;
	
	@Column(name="Category_Name")
	private int categoryName;
	
	@OneToMany(mappedBy = "Category",fetch = FetchType.LAZY)
	private List<Product> products;
}