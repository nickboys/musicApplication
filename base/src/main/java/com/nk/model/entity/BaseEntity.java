package com.nk.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : nk
 * @date : Created on 2017/09/09.
 */
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Comparable<BaseEntity>, Serializable {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 20)
  private Long id;

  /**
   * 创建时间
   */
  @Column(name = "created_date", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  /**
   * 更新时间
   */
  @Column(name = "updated_date", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedDate;

  @PrePersist
  public void prePersist() {
    createdDate = updatedDate = new Date();
  }

  @PreUpdate
  public void preUpdate() {
    updatedDate = new Date();
  }

  @Override
  public int compareTo(BaseEntity o) {
    return this.getId().compareTo(o.getId());
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || other.getClass() != this.getClass()) {
      return false;
    }
    return this.getId().equals(((BaseEntity) other).getId());
  }

//  @Override
//  public int hashCode() {
//    return new HashCodeBuilder().append(getId()).toHashCode();
//  }
//
//  @Override
//  public String toString() {
//    return JacksonUtil.toJsonString(this);
//  }

}