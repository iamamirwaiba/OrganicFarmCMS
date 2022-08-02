//package org.ismt.organicfarmcms.test
//
//import org.ismt.organicfarmcms.Department.Department
//import org.springframework.data.domain.{Example, Page, Pageable, Sort}
//import org.springframework.data.jpa.repository.JpaRepository
//import org.springframework.data.repository.query.FluentQuery
//import org.springframework.stereotype.Repository
//
//import java.{lang, util}
//import java.util.{Optional, function}
//
//@Repository
//class BranchRepoImpl extends BranchRepo{
//  override def findAll(): util.List[Department]
//
//  override def findAll(sort: Sort): util.List[Department] = ???
//
//  override def findAllById(ids: lang.Iterable[Integer]): util.List[Department] = ???
//
//  override def saveAll[S <: Department](entities: lang.Iterable[S]): util.List[S] = ???
//
//  override def flush(): Unit = ???
//
//  override def saveAndFlush[S <: Department](entity: S): S = ???
//
//  override def saveAllAndFlush[S <: Department](entities: lang.Iterable[S]): util.List[S] = ???
//
//  override def deleteAllInBatch(entities: lang.Iterable[Department]): Unit = ???
//
//  override def deleteAllByIdInBatch(ids: lang.Iterable[Integer]): Unit = ???
//
//  override def deleteAllInBatch(): Unit = ???
//
//  override def getOne(id: Integer): Department = ???
//
//  override def getById(id: Integer): Department = ???
//
//  override def getReferenceById(id: Integer): Department = ???
//
//  override def findAll[S <: Department](example: Example[S]): util.List[S] = ???
//
//  override def findAll[S <: Department](example: Example[S], sort: Sort): util.List[S] = ???
//
//  override def findAll(pageable: Pageable): Page[Department] = ???
//
//  override def save[S <: Department](entity: S): S = ???
//
//  override def findById(id: Integer): Optional[Department] = ???
//
//  override def existsById(id: Integer): Boolean = ???
//
//  override def count(): Long = ???
//
//  override def deleteById(id: Integer): Unit = ???
//
//  override def delete(entity: Department): Unit = ???
//
//  override def deleteAllById(ids: lang.Iterable[_ <: Integer]): Unit = ???
//
//  override def deleteAll(entities: lang.Iterable[_ <: Department]): Unit = ???
//
//  override def deleteAll(): Unit = ???
//
//  override def findOne[S <: Department](example: Example[S]): Optional[S] = ???
//
//  override def findAll[S <: Department](example: Example[S], pageable: Pageable): Page[S] = ???
//
//  override def count[S <: Department](example: Example[S]): Long = ???
//
//  override def exists[S <: Department](example: Example[S]): Boolean = ???
//
//  override def findBy[S <: Department, R](example: Example[S], queryFunction: function.Function[FluentQuery.FetchableFluentQuery[S], R]): R = ???
//}
