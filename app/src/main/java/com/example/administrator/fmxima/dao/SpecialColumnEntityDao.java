package com.example.administrator.fmxima.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.administrator.fmxima.entities.SpecialColumnEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SPECIAL_COLUMN_ENTITY".
*/
public class SpecialColumnEntityDao extends AbstractDao<SpecialColumnEntity, Void> {

    public static final String TABLENAME = "SPECIAL_COLUMN_ENTITY";

    /**
     * Properties of entity SpecialColumnEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ColumnType = new Property(0, String.class, "columnType", false, "COLUMN_TYPE");
        public final static Property SpecialId = new Property(1, String.class, "specialId", false, "SPECIAL_ID");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Subtitle = new Property(3, String.class, "subtitle", false, "SUBTITLE");
        public final static Property Footnote = new Property(4, String.class, "footnote", false, "FOOTNOTE");
        public final static Property CoverPath = new Property(5, String.class, "coverPath", false, "COVER_PATH");
        public final static Property ContentType = new Property(6, String.class, "contentType", false, "CONTENT_TYPE");
    };


    public SpecialColumnEntityDao(DaoConfig config) {
        super(config);
    }
    
    public SpecialColumnEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SPECIAL_COLUMN_ENTITY\" (" + //
                "\"COLUMN_TYPE\" TEXT," + // 0: columnType
                "\"SPECIAL_ID\" TEXT," + // 1: specialId
                "\"TITLE\" TEXT," + // 2: title
                "\"SUBTITLE\" TEXT," + // 3: subtitle
                "\"FOOTNOTE\" TEXT," + // 4: footnote
                "\"COVER_PATH\" TEXT," + // 5: coverPath
                "\"CONTENT_TYPE\" TEXT);"); // 6: contentType
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SPECIAL_COLUMN_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, SpecialColumnEntity entity) {
        stmt.clearBindings();
 
        String columnType = entity.getColumnType();
        if (columnType != null) {
            stmt.bindString(1, columnType);
        }
 
        String specialId = entity.getSpecialId();
        if (specialId != null) {
            stmt.bindString(2, specialId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String subtitle = entity.getSubtitle();
        if (subtitle != null) {
            stmt.bindString(4, subtitle);
        }
 
        String footnote = entity.getFootnote();
        if (footnote != null) {
            stmt.bindString(5, footnote);
        }
 
        String coverPath = entity.getCoverPath();
        if (coverPath != null) {
            stmt.bindString(6, coverPath);
        }
 
        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(7, contentType);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public SpecialColumnEntity readEntity(Cursor cursor, int offset) {
        SpecialColumnEntity entity = new SpecialColumnEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // columnType
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // specialId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // subtitle
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // footnote
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // coverPath
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // contentType
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, SpecialColumnEntity entity, int offset) {
        entity.setColumnType(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setSpecialId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSubtitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFootnote(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCoverPath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContentType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(SpecialColumnEntity entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(SpecialColumnEntity entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
