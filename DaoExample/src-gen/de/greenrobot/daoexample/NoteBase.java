package de.greenrobot.daoexample;




import de.greenrobot.daoexample.NoteActivity;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT . Enable "keep" sections if you want to edit.
/**
 * Entity mapped to table NOTE.
 */
@Test
@Test2( singleValueeee )
@Test3( key2 = "value2", key1 = 5 )
@Test4( key2 = "value2", key1 = null )
abstract public class NoteBase {

    protected Long id;
    /** Not-null value. */
    protected String text;
    @JSONIgnore
    protected String comment;
    protected java.util.Date date;
    protected Integer __gender;
    protected java.util.List<String> userIds;


    //enum properties
    private NoteActivity.Gender gender;


    @Deprecated
    public NoteBase() {
    }

    public NoteBase(Long id) {
        this.id = id;
    }

    @Inject( Context )
    public NoteBase(Long id, String text, String comment, java.util.Date date, Integer __gender, java.util.List<String> userIds) {
        this.id = id;
        this.text = text;
        this.comment = comment;
        this.date = date;
        this.__gender = __gender;
        this.userIds = userIds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getText() {
        return text;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    @test5( key1 = value1 )
    public void setText(String text) {
        this.text = text;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public java.util.Date getDate() {
        return date;
    }

    @Test( key1 = value1 )
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    @Test( key1 = value1 )
    public Integer get__gender() {
        return __gender;
    }

    @Test( key1 = value1 )
    public void set__gender(Integer __gender) {
        this.__gender = __gender;
    }

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
    }

    public void updateNotNull(Note other) {
        if(other.id != null) {
            this.id = other.id;
        }

        if(other.text != null) {
            this.text = other.text;
        }

        if(other.comment != null) {
            this.comment = other.comment;
        }

        if(other.date != null) {
            this.date = other.date;
        }

        if(other.getGender() != null) {
            setGender(other.getGender());
        }

        if(other.userIds != null) {
            this.userIds = other.userIds;
        }

        // relationships
    }

    public NoteActivity.Gender getGender() {
        if(gender == null && __gender != null) {
           gender  = NoteActivity.Gender.values()[__gender];
        }
        return gender;
    }

    public void setGender(NoteActivity.Gender gender) {
        this.gender = gender;
        if( this.gender == null) {
            __gender = null;
        } else {
            __gender = this.gender.ordinal();
        }
    }

}