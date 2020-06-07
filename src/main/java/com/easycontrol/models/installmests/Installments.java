// package com.easycontrol.models.installmests;

// import java.math.BigDecimal;
// import java.time.LocalDate;
// import java.util.UUID;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.FetchType;
// import javax.persistence.ForeignKey;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
// import javax.validation.constraints.NotNull;

// import com.easycontrol.models.abstracts.AbstractEntity;
// import com.easycontrol.models.accounts.Accounts;

// @Entity
// public class Installments extends AbstractEntity {

//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private UUID uuid;
//     @NotNull
//     @Column(columnDefinition = "boolean default false")
//     private Boolean itsPaid;
//     @NotNull
//     private Integer InstallmentNumber;

//     @NotNull
//     @Column(
//         precision = 10, scale = 4
//     )
//     private BigDecimal value;
//     @NotNull
//     private LocalDate dueDate;

//     @NotNull
//     @JoinColumn(
//         name = "accounts_fk",
//         foreignKey = @ForeignKey(name="inst_acco_fk"))
//     @ManyToOne(fetch = FetchType.LAZY)
//     private Accounts accounts;

//     public UUID getUuid() {
//         return uuid;
//     }

//     public void setUuid(UUID uuid) {
//         this.uuid = uuid;
//     }

//     public Boolean getItsPaid() {
//         return itsPaid;
//     }

//     public void setItsPaid(Boolean itsPaid) {
//         this.itsPaid = itsPaid;
//     }

//     public Integer getInstallmentNumber() {
//         return InstallmentNumber;
//     }

//     public void setInstallmentNumber(Integer installmentNumber) {
//         InstallmentNumber = installmentNumber;
//     }

//     public BigDecimal getValue() {
//         return value;
//     }

//     public void setValue(BigDecimal value) {
//         this.value = value;
//     }

//     public LocalDate getDueDate() {
//         return dueDate;
//     }

//     public void setDueDate(LocalDate dueDate) {
//         this.dueDate = dueDate;
//     }

//     public Accounts getAccounts() {
//         return accounts;
//     }

//     public void setAccounts(Accounts accounts) {
//         this.accounts = accounts;
//     }

// }