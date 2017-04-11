//index.js
//获取应用实例
Page({
  data: {
    array: [{
      mode: 'scaleToFill',
      text: 'scaleToFill：不保持纵横比缩放图片，使图片完全适应'
    }],
    src: '../../resources/cat.jpg'
  },
  imageError: function(e) {
    console.log('image3发生error事件，携带值为', e.detail.errMsg)
  },
  tanchu: function(e){
    wx.showModal({
      title: "pengkai",
      content: "haha",
      success: function(res){
        if (res.confirm){
          wx.showToast({
            title: "icon",
            image: "../../resources/cat.jpg"
          })
        }
      }
    })
  }
})