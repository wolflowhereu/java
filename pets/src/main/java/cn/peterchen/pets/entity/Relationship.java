package cn.peterchen.pets.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by fanHB on 15-1-28.
 */

public class Relationship extends IdEntity{
    private long masterUid;
    private long petUid;
    private Timestamp createTime;
}
