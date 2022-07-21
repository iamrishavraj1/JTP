import { useState, useEffect } from "react";
import Loading from "./Loading";
import Tours from "./Tours";
const url = "https://course-api.com/react-tours-project";
const App = () => {
  const [loading, setLoading] = useState(false);
  const [tours, setTours] = useState([]);
  const fetechData = async () => {
    try {
      setLoading(true);
      const response = await fetch(url);
      const tours = await response.json();
      setLoading(false);
      setTours(tours);
    } catch (error) {
      setLoading(false);
      console.log(error);
    }
  };

  useEffect(() => {
    fetechData();
  }, []);

  if (loading) {
    return (
      <>
        <main>
          <Loading />
        </main>
      </>
    );
  }
  return (
    <>
      <div>
        <Tours tourData={tours} />
      </div>
    </>
  );
};

export default App;
