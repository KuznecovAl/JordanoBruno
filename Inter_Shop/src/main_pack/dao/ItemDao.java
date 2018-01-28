package main_pack.dao;


import java.sql.SQLException;
import java.util.List;
import main_pack.entities.Item;

public interface ItemDao extends DAO<Item>{
    Item getItemByModelAndSupplier(String model, String supplier) throws SQLException;
    List<Item> getAll() throws SQLException;
}