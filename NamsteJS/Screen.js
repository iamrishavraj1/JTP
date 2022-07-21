let player = document.getElementById("player");

async function play() {
  try {
    let getScreenData = await navigator.mediaDevices.getDisplayMedia({
      video: true,
      audio: true,
    });
    player.srcObject = getScreenData;
  } catch (e) {
    console.log(`Error: ${e}`);
  }
}
