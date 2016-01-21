package com.example.administrator.fmxima.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.administrator.fmxima.entities.DiscoverEntity;
import com.example.administrator.fmxima.entities.HotRecommendsEntity;
import com.example.administrator.fmxima.entities.AlbumEntity;
import com.example.administrator.fmxima.entities.TrackEntity;
import com.example.administrator.fmxima.entities.FocusImageEntity;
import com.example.administrator.fmxima.entities.BulletAreaEntity;
import com.example.administrator.fmxima.entities.SpecialColumnEntity;

import com.example.administrator.fmxima.dao.DiscoverEntityDao;
import com.example.administrator.fmxima.dao.HotRecommendsEntityDao;
import com.example.administrator.fmxima.dao.AlbumEntityDao;
import com.example.administrator.fmxima.dao.TrackEntityDao;
import com.example.administrator.fmxima.dao.FocusImageEntityDao;
import com.example.administrator.fmxima.dao.BulletAreaEntityDao;
import com.example.administrator.fmxima.dao.SpecialColumnEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig discoverEntityDaoConfig;
    private final DaoConfig hotRecommendsEntityDaoConfig;
    private final DaoConfig albumEntityDaoConfig;
    private final DaoConfig trackEntityDaoConfig;
    private final DaoConfig focusImageEntityDaoConfig;
    private final DaoConfig bulletAreaEntityDaoConfig;
    private final DaoConfig specialColumnEntityDaoConfig;

    private final DiscoverEntityDao discoverEntityDao;
    private final HotRecommendsEntityDao hotRecommendsEntityDao;
    private final AlbumEntityDao albumEntityDao;
    private final TrackEntityDao trackEntityDao;
    private final FocusImageEntityDao focusImageEntityDao;
    private final BulletAreaEntityDao bulletAreaEntityDao;
    private final SpecialColumnEntityDao specialColumnEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        discoverEntityDaoConfig = daoConfigMap.get(DiscoverEntityDao.class).clone();
        discoverEntityDaoConfig.initIdentityScope(type);

        hotRecommendsEntityDaoConfig = daoConfigMap.get(HotRecommendsEntityDao.class).clone();
        hotRecommendsEntityDaoConfig.initIdentityScope(type);

        albumEntityDaoConfig = daoConfigMap.get(AlbumEntityDao.class).clone();
        albumEntityDaoConfig.initIdentityScope(type);

        trackEntityDaoConfig = daoConfigMap.get(TrackEntityDao.class).clone();
        trackEntityDaoConfig.initIdentityScope(type);

        focusImageEntityDaoConfig = daoConfigMap.get(FocusImageEntityDao.class).clone();
        focusImageEntityDaoConfig.initIdentityScope(type);

        bulletAreaEntityDaoConfig = daoConfigMap.get(BulletAreaEntityDao.class).clone();
        bulletAreaEntityDaoConfig.initIdentityScope(type);

        specialColumnEntityDaoConfig = daoConfigMap.get(SpecialColumnEntityDao.class).clone();
        specialColumnEntityDaoConfig.initIdentityScope(type);

        discoverEntityDao = new DiscoverEntityDao(discoverEntityDaoConfig, this);
        hotRecommendsEntityDao = new HotRecommendsEntityDao(hotRecommendsEntityDaoConfig, this);
        albumEntityDao = new AlbumEntityDao(albumEntityDaoConfig, this);
        trackEntityDao = new TrackEntityDao(trackEntityDaoConfig, this);
        focusImageEntityDao = new FocusImageEntityDao(focusImageEntityDaoConfig, this);
        bulletAreaEntityDao = new BulletAreaEntityDao(bulletAreaEntityDaoConfig, this);
        specialColumnEntityDao = new SpecialColumnEntityDao(specialColumnEntityDaoConfig, this);

        registerDao(DiscoverEntity.class, discoverEntityDao);
        registerDao(HotRecommendsEntity.class, hotRecommendsEntityDao);
        registerDao(AlbumEntity.class, albumEntityDao);
        registerDao(TrackEntity.class, trackEntityDao);
        registerDao(FocusImageEntity.class, focusImageEntityDao);
        registerDao(BulletAreaEntity.class, bulletAreaEntityDao);
        registerDao(SpecialColumnEntity.class, specialColumnEntityDao);
    }
    
    public void clear() {
        discoverEntityDaoConfig.getIdentityScope().clear();
        hotRecommendsEntityDaoConfig.getIdentityScope().clear();
        albumEntityDaoConfig.getIdentityScope().clear();
        trackEntityDaoConfig.getIdentityScope().clear();
        focusImageEntityDaoConfig.getIdentityScope().clear();
        bulletAreaEntityDaoConfig.getIdentityScope().clear();
        specialColumnEntityDaoConfig.getIdentityScope().clear();
    }

    public DiscoverEntityDao getDiscoverEntityDao() {
        return discoverEntityDao;
    }

    public HotRecommendsEntityDao getHotRecommendsEntityDao() {
        return hotRecommendsEntityDao;
    }

    public AlbumEntityDao getAlbumEntityDao() {
        return albumEntityDao;
    }

    public TrackEntityDao getTrackEntityDao() {
        return trackEntityDao;
    }

    public FocusImageEntityDao getFocusImageEntityDao() {
        return focusImageEntityDao;
    }

    public BulletAreaEntityDao getBulletAreaEntityDao() {
        return bulletAreaEntityDao;
    }

    public SpecialColumnEntityDao getSpecialColumnEntityDao() {
        return specialColumnEntityDao;
    }

}
