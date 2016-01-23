package com.example.administrator.fmxima.entities;

/**
 * Created by Administrator on 16-1-22.
 */
public class HomeEntity {

    private HotRecommends hotRecommends;
    private FocusImages focusImages;
    private SpecialColumns specialColumn;
    private Discovers discoveryColumns;
    private BulletAreas bulletArea;
    private EditRecommands editorRecommendAlbums;

    public HotRecommends getHotRecommends() {
        return hotRecommends;
    }

    public void setHotRecommends(HotRecommends hotRecommends) {
        this.hotRecommends = hotRecommends;
    }

    public FocusImages getFocusImages() {
        return focusImages;
    }

    public void setFocusImages(FocusImages focusImages) {
        this.focusImages = focusImages;
    }

    public SpecialColumns getSpecialColumn() {
        return specialColumn;
    }

    public void setSpecialColumn(SpecialColumns specialColumn) {
        this.specialColumn = specialColumn;
    }

    public Discovers getDiscoveryColumns() {
        return discoveryColumns;
    }

    public void setDiscoveryColumns(Discovers discoveryColumns) {
        this.discoveryColumns = discoveryColumns;
    }

    public BulletAreas getBulletArea() {
        return bulletArea;
    }

    public void setBulletArea(BulletAreas bulletArea) {
        this.bulletArea = bulletArea;
    }

    public EditRecommands getEditorRecommendAlbums() {
        return editorRecommendAlbums;
    }

    public void setEditorRecommendAlbums(EditRecommands editorRecommendAlbums) {
        this.editorRecommendAlbums = editorRecommendAlbums;
    }
}
